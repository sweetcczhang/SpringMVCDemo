package cn.edu.bupt.springmvc.web.service.impl;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.core.generic.GenericServiceImpl;
import cn.edu.bupt.springmvc.web.dao.MerchantMapper;
import cn.edu.bupt.springmvc.web.exception.DataFailException;
import cn.edu.bupt.springmvc.web.model.Merchant;
import cn.edu.bupt.springmvc.web.model.MerchantExample;
import cn.edu.bupt.springmvc.web.service.MerchantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FirenzesEagle on 2016/6/5 0005.
 * Email:liumingbo2008@gmail.com
 */
@Service
public class MerchantServiceImpl extends GenericServiceImpl<Merchant, Long> implements MerchantService {

    private static final Logger log = LoggerFactory.getLogger(MerchantServiceImpl.class);

    @Resource
    private MerchantMapper merchantMapper;

    @Override
    public GenericDao<Merchant, Long> getDao() {
        return merchantMapper;
    }

    @Override
    public Long insert(Merchant model) {
        return merchantMapper.insertSelective(model);
    }

    @Override
    public int update(Merchant model) {
        return merchantMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return merchantMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Merchant selectById(Long id) {
        return merchantMapper.selectByPrimaryKey(id);
    }

    @Override
    public Merchant selectByMerchantName(String merchantName) throws DataFailException {
        MerchantExample merchantExample = new MerchantExample();
        merchantExample.createCriteria().andMerchantNameEqualTo(merchantName);
        final List<Merchant> list = merchantMapper.selectByExample(merchantExample);
        if (list == null || list.size() <= 0) {
            throw new DataFailException();
        } else {
            return list.get(0);
        }
    }

    @Override
    public Merchant selectByUserId(String userId) throws DataFailException {
        MerchantExample merchantExample = new MerchantExample();
        merchantExample.createCriteria().andUserIdEqualTo(userId);
        final List<Merchant> list = merchantMapper.selectByExample(merchantExample);
        if (list == null || list.size() <= 0) {
            throw new DataFailException();
        } else {
            return list.get(0);
        }

    }

    @Override
    public Merchant selectByMerchantId(Long merchantId) throws DataFailException {
        MerchantExample merchantExample = new MerchantExample();
        merchantExample.createCriteria().andMerchantIdEqualTo(merchantId);
        final List<Merchant> list = merchantMapper.selectByExample(merchantExample);
        if (list == null || list.size() <= 0) {
            throw new DataFailException();
        } else {
            return list.get(0);
        }
    }

}
