package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionIsNull() {
            addCriterion("shop_introduction is null");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionIsNotNull() {
            addCriterion("shop_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionEqualTo(String value) {
            addCriterion("shop_introduction =", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotEqualTo(String value) {
            addCriterion("shop_introduction <>", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionGreaterThan(String value) {
            addCriterion("shop_introduction >", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("shop_introduction >=", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionLessThan(String value) {
            addCriterion("shop_introduction <", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionLessThanOrEqualTo(String value) {
            addCriterion("shop_introduction <=", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionLike(String value) {
            addCriterion("shop_introduction like", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotLike(String value) {
            addCriterion("shop_introduction not like", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionIn(List<String> values) {
            addCriterion("shop_introduction in", values, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotIn(List<String> values) {
            addCriterion("shop_introduction not in", values, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionBetween(String value1, String value2) {
            addCriterion("shop_introduction between", value1, value2, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotBetween(String value1, String value2) {
            addCriterion("shop_introduction not between", value1, value2, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(Byte value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(Byte value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(Byte value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(Byte value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(Byte value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<Byte> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<Byte> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(Byte value1, Byte value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopCoverIsNull() {
            addCriterion("shop_cover is null");
            return (Criteria) this;
        }

        public Criteria andShopCoverIsNotNull() {
            addCriterion("shop_cover is not null");
            return (Criteria) this;
        }

        public Criteria andShopCoverEqualTo(String value) {
            addCriterion("shop_cover =", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverNotEqualTo(String value) {
            addCriterion("shop_cover <>", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverGreaterThan(String value) {
            addCriterion("shop_cover >", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverGreaterThanOrEqualTo(String value) {
            addCriterion("shop_cover >=", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverLessThan(String value) {
            addCriterion("shop_cover <", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverLessThanOrEqualTo(String value) {
            addCriterion("shop_cover <=", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverLike(String value) {
            addCriterion("shop_cover like", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverNotLike(String value) {
            addCriterion("shop_cover not like", value, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverIn(List<String> values) {
            addCriterion("shop_cover in", values, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverNotIn(List<String> values) {
            addCriterion("shop_cover not in", values, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverBetween(String value1, String value2) {
            addCriterion("shop_cover between", value1, value2, "shopCover");
            return (Criteria) this;
        }

        public Criteria andShopCoverNotBetween(String value1, String value2) {
            addCriterion("shop_cover not between", value1, value2, "shopCover");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Long value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Long value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Long value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Long value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Long> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Long> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Long value1, Long value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andShopStateIsNull() {
            addCriterion("shop_state is null");
            return (Criteria) this;
        }

        public Criteria andShopStateIsNotNull() {
            addCriterion("shop_state is not null");
            return (Criteria) this;
        }

        public Criteria andShopStateEqualTo(Byte value) {
            addCriterion("shop_state =", value, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateNotEqualTo(Byte value) {
            addCriterion("shop_state <>", value, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateGreaterThan(Byte value) {
            addCriterion("shop_state >", value, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("shop_state >=", value, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateLessThan(Byte value) {
            addCriterion("shop_state <", value, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateLessThanOrEqualTo(Byte value) {
            addCriterion("shop_state <=", value, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateIn(List<Byte> values) {
            addCriterion("shop_state in", values, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateNotIn(List<Byte> values) {
            addCriterion("shop_state not in", values, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateBetween(Byte value1, Byte value2) {
            addCriterion("shop_state between", value1, value2, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopStateNotBetween(Byte value1, Byte value2) {
            addCriterion("shop_state not between", value1, value2, "shopState");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateIsNull() {
            addCriterion("shop_create_date is null");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateIsNotNull() {
            addCriterion("shop_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateEqualTo(Date value) {
            addCriterion("shop_create_date =", value, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateNotEqualTo(Date value) {
            addCriterion("shop_create_date <>", value, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateGreaterThan(Date value) {
            addCriterion("shop_create_date >", value, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_create_date >=", value, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateLessThan(Date value) {
            addCriterion("shop_create_date <", value, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("shop_create_date <=", value, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateIn(List<Date> values) {
            addCriterion("shop_create_date in", values, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateNotIn(List<Date> values) {
            addCriterion("shop_create_date not in", values, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateBetween(Date value1, Date value2) {
            addCriterion("shop_create_date between", value1, value2, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("shop_create_date not between", value1, value2, "shopCreateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateIsNull() {
            addCriterion("shop_update_date is null");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateIsNotNull() {
            addCriterion("shop_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateEqualTo(Date value) {
            addCriterion("shop_update_date =", value, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateNotEqualTo(Date value) {
            addCriterion("shop_update_date <>", value, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateGreaterThan(Date value) {
            addCriterion("shop_update_date >", value, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_update_date >=", value, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateLessThan(Date value) {
            addCriterion("shop_update_date <", value, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("shop_update_date <=", value, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateIn(List<Date> values) {
            addCriterion("shop_update_date in", values, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateNotIn(List<Date> values) {
            addCriterion("shop_update_date not in", values, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateBetween(Date value1, Date value2) {
            addCriterion("shop_update_date between", value1, value2, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("shop_update_date not between", value1, value2, "shopUpdateDate");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteIsNull() {
            addCriterion("shop_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteIsNotNull() {
            addCriterion("shop_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteEqualTo(Byte value) {
            addCriterion("shop_is_delete =", value, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteNotEqualTo(Byte value) {
            addCriterion("shop_is_delete <>", value, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteGreaterThan(Byte value) {
            addCriterion("shop_is_delete >", value, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("shop_is_delete >=", value, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteLessThan(Byte value) {
            addCriterion("shop_is_delete <", value, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("shop_is_delete <=", value, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteIn(List<Byte> values) {
            addCriterion("shop_is_delete in", values, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteNotIn(List<Byte> values) {
            addCriterion("shop_is_delete not in", values, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("shop_is_delete between", value1, value2, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("shop_is_delete not between", value1, value2, "shopIsDelete");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceIsNull() {
            addCriterion("shop_locate_province is null");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceIsNotNull() {
            addCriterion("shop_locate_province is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceEqualTo(String value) {
            addCriterion("shop_locate_province =", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceNotEqualTo(String value) {
            addCriterion("shop_locate_province <>", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceGreaterThan(String value) {
            addCriterion("shop_locate_province >", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("shop_locate_province >=", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceLessThan(String value) {
            addCriterion("shop_locate_province <", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceLessThanOrEqualTo(String value) {
            addCriterion("shop_locate_province <=", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceLike(String value) {
            addCriterion("shop_locate_province like", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceNotLike(String value) {
            addCriterion("shop_locate_province not like", value, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceIn(List<String> values) {
            addCriterion("shop_locate_province in", values, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceNotIn(List<String> values) {
            addCriterion("shop_locate_province not in", values, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceBetween(String value1, String value2) {
            addCriterion("shop_locate_province between", value1, value2, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateProvinceNotBetween(String value1, String value2) {
            addCriterion("shop_locate_province not between", value1, value2, "shopLocateProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityIsNull() {
            addCriterion("shop_locate_city is null");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityIsNotNull() {
            addCriterion("shop_locate_city is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityEqualTo(String value) {
            addCriterion("shop_locate_city =", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityNotEqualTo(String value) {
            addCriterion("shop_locate_city <>", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityGreaterThan(String value) {
            addCriterion("shop_locate_city >", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityGreaterThanOrEqualTo(String value) {
            addCriterion("shop_locate_city >=", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityLessThan(String value) {
            addCriterion("shop_locate_city <", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityLessThanOrEqualTo(String value) {
            addCriterion("shop_locate_city <=", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityLike(String value) {
            addCriterion("shop_locate_city like", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityNotLike(String value) {
            addCriterion("shop_locate_city not like", value, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityIn(List<String> values) {
            addCriterion("shop_locate_city in", values, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityNotIn(List<String> values) {
            addCriterion("shop_locate_city not in", values, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityBetween(String value1, String value2) {
            addCriterion("shop_locate_city between", value1, value2, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateCityNotBetween(String value1, String value2) {
            addCriterion("shop_locate_city not between", value1, value2, "shopLocateCity");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaIsNull() {
            addCriterion("shop_locate_area is null");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaIsNotNull() {
            addCriterion("shop_locate_area is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaEqualTo(String value) {
            addCriterion("shop_locate_area =", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaNotEqualTo(String value) {
            addCriterion("shop_locate_area <>", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaGreaterThan(String value) {
            addCriterion("shop_locate_area >", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaGreaterThanOrEqualTo(String value) {
            addCriterion("shop_locate_area >=", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaLessThan(String value) {
            addCriterion("shop_locate_area <", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaLessThanOrEqualTo(String value) {
            addCriterion("shop_locate_area <=", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaLike(String value) {
            addCriterion("shop_locate_area like", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaNotLike(String value) {
            addCriterion("shop_locate_area not like", value, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaIn(List<String> values) {
            addCriterion("shop_locate_area in", values, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaNotIn(List<String> values) {
            addCriterion("shop_locate_area not in", values, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaBetween(String value1, String value2) {
            addCriterion("shop_locate_area between", value1, value2, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopLocateAreaNotBetween(String value1, String value2) {
            addCriterion("shop_locate_area not between", value1, value2, "shopLocateArea");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenIsNull() {
            addCriterion("shop_is_open is null");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenIsNotNull() {
            addCriterion("shop_is_open is not null");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenEqualTo(Byte value) {
            addCriterion("shop_is_open =", value, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenNotEqualTo(Byte value) {
            addCriterion("shop_is_open <>", value, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenGreaterThan(Byte value) {
            addCriterion("shop_is_open >", value, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("shop_is_open >=", value, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenLessThan(Byte value) {
            addCriterion("shop_is_open <", value, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenLessThanOrEqualTo(Byte value) {
            addCriterion("shop_is_open <=", value, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenIn(List<Byte> values) {
            addCriterion("shop_is_open in", values, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenNotIn(List<Byte> values) {
            addCriterion("shop_is_open not in", values, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenBetween(Byte value1, Byte value2) {
            addCriterion("shop_is_open between", value1, value2, "shopIsOpen");
            return (Criteria) this;
        }

        public Criteria andShopIsOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("shop_is_open not between", value1, value2, "shopIsOpen");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}