package cn.edu.bupt.springmvc.web.controller;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.exception.DataFailException;
import cn.edu.bupt.springmvc.web.model.Merchant;
import cn.edu.bupt.springmvc.web.model.Shop;
import cn.edu.bupt.springmvc.web.service.MerchantService;
import cn.edu.bupt.springmvc.web.service.ShopService;
import cn.edu.bupt.springmvc.web.util.ReturnModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by FirenzesEagle on 2016/6/5 0005.
 * Email:liumingbo2008@gmail.com
 */
@Controller
@RequestMapping(value = "shop")
public class ShopController extends GenericController {

    @Resource
    private ShopService shopService;

    @Resource
    private MerchantService merchantService;

    @RequestMapping(value = "/addShop", method = RequestMethod.POST)
    public void addShop(@ModelAttribute Shop shop, HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        try {
            shopService.insert(shop);
            returnModel.setResult(true);
            returnModel.setDatum(shop.getShopId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response, returnModel);
            logger.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/addShop", method = RequestMethod.GET)
    public void addShop(@RequestParam(value = "shopName") String shopName,
                        @RequestParam(value = "shopIntroduction") String shopIntroduction,
                        @RequestParam(value = "shopType") Byte shopType,
                        @RequestParam(value = "shopCover") String shopCover,
                        @RequestParam(value = "merchantId") Long merchantId,
                        @RequestParam(value = "merchantName") String merchantName,
                        @RequestParam(value = "shopState") Byte shopState,
                        @RequestParam(value = "shopCreateDate") Date shopCreateDate,
                        @RequestParam(value = "shopUpdateDate") Date shopUpdateDate,
                        @RequestParam(value = "shopIsDelete") Byte shopIsDelete,
                        @RequestParam(value = "shopLocateProvince") String shopLocateProvince,
                        @RequestParam(value = "shopLocateCity") String shopLocateCity,
                        @RequestParam(value = "shopLocateArea") String shopLocateArea,
                        @RequestParam(value = "shopIsOpen") Byte shopIsOpen,
                        HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        Shop shop = new Shop(shopName, shopIntroduction, shopType, shopCover, merchantId, merchantName, shopState, shopCreateDate, shopUpdateDate, shopIsDelete, shopLocateProvince, shopLocateCity, shopLocateArea, shopIsOpen);
        try {
            shopService.insert(shop);
            returnModel.setResult(true);
            returnModel.setDatum(shop.getShopId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response, returnModel);
            logger.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/getShopIdFromUserId")
    public void getShopIdFromUserId(@RequestParam(value = "userId") String userId, HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        Merchant merchant = null;
        try {
            merchant = merchantService.selectByUserId(userId);
            Shop shop = shopService.selectByMerchantId(merchant.getMerchantId());
            returnModel.setResult(true);
            returnModel.setDatum(shop.getShopId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response,returnModel);
            logger.error(e.getMessage());
        }
    }

    @RequestMapping(value = "/getUserIdFromShopId")
    public void getUserIdFromShopId(@RequestParam(value = "shopId") Long shopId, HttpServletResponse response) {
        ReturnModel returnModel = new ReturnModel();
        Shop shop = null;
        try {
            shop = shopService.selectByShopId(shopId);
            Merchant merchant = merchantService.selectByMerchantId(shop.getMerchantId());
            returnModel.setResult(true);
            returnModel.setDatum(merchant.getUserId());
            renderString(response, returnModel);
        } catch (DataFailException e) {
            returnModel.setResult(false);
            returnModel.setReason(e.getMessage());
            renderString(response, returnModel);
            logger.error(e.getMessage());
        }
    }

}
