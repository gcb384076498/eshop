package cn.mineserv.eshop.example;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andAddrIdIsNull() {
            addCriterion("`addr_id` is null");
            return (Criteria) this;
        }

        public Criteria andAddrIdIsNotNull() {
            addCriterion("`addr_id` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIdEqualTo(Integer value) {
            addCriterion("`addr_id` =", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotEqualTo(Integer value) {
            addCriterion("`addr_id` <>", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThan(Integer value) {
            addCriterion("`addr_id` >", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`addr_id` >=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThan(Integer value) {
            addCriterion("`addr_id` <", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("`addr_id` <=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdIn(List<Integer> values) {
            addCriterion("`addr_id` in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotIn(List<Integer> values) {
            addCriterion("`addr_id` not in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("`addr_id` between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`addr_id` not between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("`user_id` is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("`user_id` is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("`user_id` =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("`user_id` <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("`user_id` >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`user_id` >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("`user_id` <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("`user_id` <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("`user_id` in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("`user_id` not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("`user_id` between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`user_id` not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIsNull() {
            addCriterion("`addr_province` is null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIsNotNull() {
            addCriterion("`addr_province` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceEqualTo(String value) {
            addCriterion("`addr_province` =", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotEqualTo(String value) {
            addCriterion("`addr_province` <>", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceGreaterThan(String value) {
            addCriterion("`addr_province` >", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("`addr_province` >=", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLessThan(String value) {
            addCriterion("`addr_province` <", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLessThanOrEqualTo(String value) {
            addCriterion("`addr_province` <=", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLike(String value) {
            addCriterion("`addr_province` like", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotLike(String value) {
            addCriterion("`addr_province` not like", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIn(List<String> values) {
            addCriterion("`addr_province` in", values, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotIn(List<String> values) {
            addCriterion("`addr_province` not in", values, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceBetween(String value1, String value2) {
            addCriterion("`addr_province` between", value1, value2, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotBetween(String value1, String value2) {
            addCriterion("`addr_province` not between", value1, value2, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNull() {
            addCriterion("`addr_city` is null");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNotNull() {
            addCriterion("`addr_city` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCityEqualTo(String value) {
            addCriterion("`addr_city` =", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotEqualTo(String value) {
            addCriterion("`addr_city` <>", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThan(String value) {
            addCriterion("`addr_city` >", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("`addr_city` >=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThan(String value) {
            addCriterion("`addr_city` <", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThanOrEqualTo(String value) {
            addCriterion("`addr_city` <=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLike(String value) {
            addCriterion("`addr_city` like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotLike(String value) {
            addCriterion("`addr_city` not like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityIn(List<String> values) {
            addCriterion("`addr_city` in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotIn(List<String> values) {
            addCriterion("`addr_city` not in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityBetween(String value1, String value2) {
            addCriterion("`addr_city` between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotBetween(String value1, String value2) {
            addCriterion("`addr_city` not between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrAreaIsNull() {
            addCriterion("`addr_area` is null");
            return (Criteria) this;
        }

        public Criteria andAddrAreaIsNotNull() {
            addCriterion("`addr_area` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrAreaEqualTo(String value) {
            addCriterion("`addr_area` =", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaNotEqualTo(String value) {
            addCriterion("`addr_area` <>", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaGreaterThan(String value) {
            addCriterion("`addr_area` >", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaGreaterThanOrEqualTo(String value) {
            addCriterion("`addr_area` >=", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaLessThan(String value) {
            addCriterion("`addr_area` <", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaLessThanOrEqualTo(String value) {
            addCriterion("`addr_area` <=", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaLike(String value) {
            addCriterion("`addr_area` like", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaNotLike(String value) {
            addCriterion("`addr_area` not like", value, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaIn(List<String> values) {
            addCriterion("`addr_area` in", values, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaNotIn(List<String> values) {
            addCriterion("`addr_area` not in", values, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaBetween(String value1, String value2) {
            addCriterion("`addr_area` between", value1, value2, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrAreaNotBetween(String value1, String value2) {
            addCriterion("`addr_area` not between", value1, value2, "addrArea");
            return (Criteria) this;
        }

        public Criteria andAddrContentIsNull() {
            addCriterion("`addr_content` is null");
            return (Criteria) this;
        }

        public Criteria andAddrContentIsNotNull() {
            addCriterion("`addr_content` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrContentEqualTo(String value) {
            addCriterion("`addr_content` =", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentNotEqualTo(String value) {
            addCriterion("`addr_content` <>", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentGreaterThan(String value) {
            addCriterion("`addr_content` >", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentGreaterThanOrEqualTo(String value) {
            addCriterion("`addr_content` >=", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentLessThan(String value) {
            addCriterion("`addr_content` <", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentLessThanOrEqualTo(String value) {
            addCriterion("`addr_content` <=", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentLike(String value) {
            addCriterion("`addr_content` like", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentNotLike(String value) {
            addCriterion("`addr_content` not like", value, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentIn(List<String> values) {
            addCriterion("`addr_content` in", values, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentNotIn(List<String> values) {
            addCriterion("`addr_content` not in", values, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentBetween(String value1, String value2) {
            addCriterion("`addr_content` between", value1, value2, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrContentNotBetween(String value1, String value2) {
            addCriterion("`addr_content` not between", value1, value2, "addrContent");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverIsNull() {
            addCriterion("`addr_receiver` is null");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverIsNotNull() {
            addCriterion("`addr_receiver` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverEqualTo(String value) {
            addCriterion("`addr_receiver` =", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverNotEqualTo(String value) {
            addCriterion("`addr_receiver` <>", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverGreaterThan(String value) {
            addCriterion("`addr_receiver` >", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("`addr_receiver` >=", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverLessThan(String value) {
            addCriterion("`addr_receiver` <", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverLessThanOrEqualTo(String value) {
            addCriterion("`addr_receiver` <=", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverLike(String value) {
            addCriterion("`addr_receiver` like", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverNotLike(String value) {
            addCriterion("`addr_receiver` not like", value, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverIn(List<String> values) {
            addCriterion("`addr_receiver` in", values, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverNotIn(List<String> values) {
            addCriterion("`addr_receiver` not in", values, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverBetween(String value1, String value2) {
            addCriterion("`addr_receiver` between", value1, value2, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrReceiverNotBetween(String value1, String value2) {
            addCriterion("`addr_receiver` not between", value1, value2, "addrReceiver");
            return (Criteria) this;
        }

        public Criteria andAddrTelIsNull() {
            addCriterion("`addr_tel` is null");
            return (Criteria) this;
        }

        public Criteria andAddrTelIsNotNull() {
            addCriterion("`addr_tel` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrTelEqualTo(String value) {
            addCriterion("`addr_tel` =", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelNotEqualTo(String value) {
            addCriterion("`addr_tel` <>", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelGreaterThan(String value) {
            addCriterion("`addr_tel` >", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelGreaterThanOrEqualTo(String value) {
            addCriterion("`addr_tel` >=", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelLessThan(String value) {
            addCriterion("`addr_tel` <", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelLessThanOrEqualTo(String value) {
            addCriterion("`addr_tel` <=", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelLike(String value) {
            addCriterion("`addr_tel` like", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelNotLike(String value) {
            addCriterion("`addr_tel` not like", value, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelIn(List<String> values) {
            addCriterion("`addr_tel` in", values, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelNotIn(List<String> values) {
            addCriterion("`addr_tel` not in", values, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelBetween(String value1, String value2) {
            addCriterion("`addr_tel` between", value1, value2, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrTelNotBetween(String value1, String value2) {
            addCriterion("`addr_tel` not between", value1, value2, "addrTel");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultIsNull() {
            addCriterion("`addr_isdefault` is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultIsNotNull() {
            addCriterion("`addr_isdefault` is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultEqualTo(Integer value) {
            addCriterion("`addr_isdefault` =", value, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultNotEqualTo(Integer value) {
            addCriterion("`addr_isdefault` <>", value, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultGreaterThan(Integer value) {
            addCriterion("`addr_isdefault` >", value, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("`addr_isdefault` >=", value, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultLessThan(Integer value) {
            addCriterion("`addr_isdefault` <", value, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultLessThanOrEqualTo(Integer value) {
            addCriterion("`addr_isdefault` <=", value, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultIn(List<Integer> values) {
            addCriterion("`addr_isdefault` in", values, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultNotIn(List<Integer> values) {
            addCriterion("`addr_isdefault` not in", values, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultBetween(Integer value1, Integer value2) {
            addCriterion("`addr_isdefault` between", value1, value2, "addrIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddrIsdefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("`addr_isdefault` not between", value1, value2, "addrIsdefault");
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