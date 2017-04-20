package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andMerchantSecurityPasswdIsNull() {
            addCriterion("merchant_security_passwd is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdIsNotNull() {
            addCriterion("merchant_security_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdEqualTo(String value) {
            addCriterion("merchant_security_passwd =", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdNotEqualTo(String value) {
            addCriterion("merchant_security_passwd <>", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdGreaterThan(String value) {
            addCriterion("merchant_security_passwd >", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_security_passwd >=", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdLessThan(String value) {
            addCriterion("merchant_security_passwd <", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdLessThanOrEqualTo(String value) {
            addCriterion("merchant_security_passwd <=", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdLike(String value) {
            addCriterion("merchant_security_passwd like", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdNotLike(String value) {
            addCriterion("merchant_security_passwd not like", value, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdIn(List<String> values) {
            addCriterion("merchant_security_passwd in", values, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdNotIn(List<String> values) {
            addCriterion("merchant_security_passwd not in", values, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdBetween(String value1, String value2) {
            addCriterion("merchant_security_passwd between", value1, value2, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantSecurityPasswdNotBetween(String value1, String value2) {
            addCriterion("merchant_security_passwd not between", value1, value2, "merchantSecurityPasswd");
            return (Criteria) this;
        }

        public Criteria andMerchantStateIsNull() {
            addCriterion("merchant_state is null");
            return (Criteria) this;
        }

        public Criteria andMerchantStateIsNotNull() {
            addCriterion("merchant_state is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantStateEqualTo(Byte value) {
            addCriterion("merchant_state =", value, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateNotEqualTo(Byte value) {
            addCriterion("merchant_state <>", value, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateGreaterThan(Byte value) {
            addCriterion("merchant_state >", value, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_state >=", value, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateLessThan(Byte value) {
            addCriterion("merchant_state <", value, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_state <=", value, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateIn(List<Byte> values) {
            addCriterion("merchant_state in", values, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateNotIn(List<Byte> values) {
            addCriterion("merchant_state not in", values, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateBetween(Byte value1, Byte value2) {
            addCriterion("merchant_state between", value1, value2, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantStateNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_state not between", value1, value2, "merchantState");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelIsNull() {
            addCriterion("merchant_level is null");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelIsNotNull() {
            addCriterion("merchant_level is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelEqualTo(Byte value) {
            addCriterion("merchant_level =", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelNotEqualTo(Byte value) {
            addCriterion("merchant_level <>", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelGreaterThan(Byte value) {
            addCriterion("merchant_level >", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_level >=", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelLessThan(Byte value) {
            addCriterion("merchant_level <", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_level <=", value, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelIn(List<Byte> values) {
            addCriterion("merchant_level in", values, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelNotIn(List<Byte> values) {
            addCriterion("merchant_level not in", values, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelBetween(Byte value1, Byte value2) {
            addCriterion("merchant_level between", value1, value2, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_level not between", value1, value2, "merchantLevel");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentIsNull() {
            addCriterion("merchant_payment is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentIsNotNull() {
            addCriterion("merchant_payment is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentEqualTo(Byte value) {
            addCriterion("merchant_payment =", value, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentNotEqualTo(Byte value) {
            addCriterion("merchant_payment <>", value, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentGreaterThan(Byte value) {
            addCriterion("merchant_payment >", value, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_payment >=", value, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentLessThan(Byte value) {
            addCriterion("merchant_payment <", value, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_payment <=", value, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentIn(List<Byte> values) {
            addCriterion("merchant_payment in", values, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentNotIn(List<Byte> values) {
            addCriterion("merchant_payment not in", values, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentBetween(Byte value1, Byte value2) {
            addCriterion("merchant_payment between", value1, value2, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantPaymentNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_payment not between", value1, value2, "merchantPayment");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedIsNull() {
            addCriterion("merchant_is_verified is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedIsNotNull() {
            addCriterion("merchant_is_verified is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedEqualTo(Byte value) {
            addCriterion("merchant_is_verified =", value, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedNotEqualTo(Byte value) {
            addCriterion("merchant_is_verified <>", value, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedGreaterThan(Byte value) {
            addCriterion("merchant_is_verified >", value, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_is_verified >=", value, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedLessThan(Byte value) {
            addCriterion("merchant_is_verified <", value, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_is_verified <=", value, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedIn(List<Byte> values) {
            addCriterion("merchant_is_verified in", values, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedNotIn(List<Byte> values) {
            addCriterion("merchant_is_verified not in", values, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedBetween(Byte value1, Byte value2) {
            addCriterion("merchant_is_verified between", value1, value2, "merchantIsVerified");
            return (Criteria) this;
        }

        public Criteria andMerchantIsVerifiedNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_is_verified not between", value1, value2, "merchantIsVerified");
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