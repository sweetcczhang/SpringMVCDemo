package cn.edu.bupt.springmvc.web.service.impl;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.core.generic.GenericServiceImpl;
import cn.edu.bupt.springmvc.web.dao.ShopMapper;
import cn.edu.bupt.springmvc.web.exception.DataFailException;
import cn.edu.bupt.springmvc.web.model.Shop;
import cn.edu.bupt.springmvc.web.model.ShopExample;
import cn.edu.bupt.springmvc.web.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FirenzesEagle on 2016/6/5 0005.
 * Email:liumingbo2008@gmail.com
 */
@Service
public class ShopServiceImpl extends GenericServiceImpl<Shop, Long> implements ShopService {

    @Resource
    ShopMapper shopMapper;

    @Override
    public GenericDao<Shop, Long> getDao() {
        return shopMapper;
    }

    @Override
    public Long insert(Shop model) {
        return shopMapper.insertSelective(model);
    }

    @Override
    public int update(Shop model) {
        return shopMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return shopMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Shop selectById(Long id) {
        return shopMapper.selectByPrimaryKey(id);
    }

    @Override
    public Shop selectByShopName(String shopName) throws DataFailException {
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andShopNameEqualTo(shopName);
        final List<Shop> list = shopMapper.selectByExample(shopExample);
        if (list == null || list.size() <= 0) {
            throw new DataFailException();
        } else {
            return list.get(0);
        }
    }

    @Override
    public Shop selectByMerchantId(Long merchantId) throws DataFailException {
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andMerchantIdEqualTo(merchantId);
        final List<Shop> list = shopMapper.selectByExample(shopExample);
        if (list == null || list.size() <= 0) {
            throw new DataFailException();
        } else {
            return list.get(0);
        }
    }

    @Override
    public Shop selectByShopId(Long shopId) throws DataFailException {
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andShopIdEqualTo(shopId);
        final List<Shop> list = shopMapper.selectByExample(shopExample);
        if (list == null || list.size() <= 0) {
            throw new DataFailException();
        } else {
            return list.get(0);
        }
    }

}
