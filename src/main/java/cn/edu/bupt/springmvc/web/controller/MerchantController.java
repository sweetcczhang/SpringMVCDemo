package cn.edu.bupt.springmvc.web.controller;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.exception.DataFailException;
import cn.edu.bupt.springmvc.web.model.Merchant;
import cn.edu.bupt.springmvc.web.service.MerchantService;
import cn.edu.bupt.springmvc.web.util.ReturnModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by FirenzesEagle on 2016/6/23 0023.
 * Email:liumingbo2008@gmail.com
 */
@Controller
@RequestMapping(value = "merchant")
public class MerchantController extends GenericController {

    @Resource
    private MerchantService merchantService;

    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
    public void addMerchant(@ModelAttribute Merchant merchant, HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        try {
            merchantService.insert(merchant);
            returnModel.setResult(true);
            returnModel.setDatum(merchant.getMerchantId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response, returnModel);
            logger.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/addMerchant", method = RequestMethod.GET)
    public void addMerchant(@RequestParam(value = "userId") String userId, String merchantName, String merchantSecurityPasswd, Byte merchantState, Byte merchantLevel, Byte merchantPayment, Byte merchantIsVerified, HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        Merchant merchant = new Merchant(userId, merchantName, merchantSecurityPasswd, merchantState, merchantLevel, merchantPayment, merchantIsVerified);
        try {
            merchantService.insert(merchant);
            returnModel.setResult(true);
            returnModel.setDatum(merchant.getMerchantId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response, returnModel);
            logger.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/getMerchantIdFromUserId")
    public void getMerchantIdFromUserId(@RequestParam(value = "userId") String userId, HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        Merchant merchant = null;
        try {
            merchant = merchantService.selectByUserId(userId);
            returnModel.setResult(true);
            returnModel.setDatum(merchant.getMerchantId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response, returnModel);
            logger.error(e.getMessage());
        }
    }

}
