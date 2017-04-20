package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.core.generic.GenericService;
import cn.edu.bupt.springmvc.web.exception.DataFailException;
import cn.edu.bupt.springmvc.web.model.Shop;

/**
 * Created by FirenzesEagle on 2016/6/5 0005.
 * Email:liumingbo2008@gmail.com
 */
public interface ShopService extends GenericService<Shop, Long> {

    /**
     * 根据店铺名查询店铺
     *
     * @param shopName
     * @return
     */
    Shop selectByShopName(String shopName) throws DataFailException;


    /**
     * 根据商户id查询店铺
     *
     * @param merchantId
     * return
     */
    Shop selectByMerchantId(Long merchantId) throws DataFailException;

    /**
     * 根据店铺id查询店铺
     *
     * @param shopId
     * @return
     */
    Shop selectByShopId(Long shopId) throws DataFailException;

}
