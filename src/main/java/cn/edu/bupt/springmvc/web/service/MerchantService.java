package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.core.generic.GenericService;
import cn.edu.bupt.springmvc.web.exception.DataFailException;
import cn.edu.bupt.springmvc.web.model.Merchant;

/**
 * Created by FirenzesEagle on 2016/6/5 0005.
 * Email:liumingbo2008@gmail.com
 */
public interface MerchantService extends GenericService<Merchant, Long> {

    /**
     * 根据商户名查询商户
     *
     * @param merchantName
     * @return
     */
    Merchant selectByMerchantName(String merchantName) throws DataFailException;

    /**
     * 根据用户id查询商户
     *
     * @param userId return
     */
    Merchant selectByUserId(String userId) throws DataFailException;

    /**
     * 根据商户id查询商户
     *
     * @param merchantId
     * @return
     */
    Merchant selectByMerchantId(Long merchantId) throws DataFailException;

}
