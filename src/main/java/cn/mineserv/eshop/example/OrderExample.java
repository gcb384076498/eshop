package cn.mineserv.eshop.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("`order_id` is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("`order_id` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("`order_id` =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("`order_id` <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("`order_id` >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`order_id` >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("`order_id` <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("`order_id` <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("`order_id` in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("`order_id` not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("`order_id` between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`order_id` not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("`order_code` is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("`order_code` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("`order_code` =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("`order_code` <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("`order_code` >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("`order_code` >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("`order_code` <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("`order_code` <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("`order_code` like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("`order_code` not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("`order_code` in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("`order_code` not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("`order_code` between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("`order_code` not between", value1, value2, "orderCode");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("`order_status` is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("`order_status` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("`order_status` =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("`order_status` <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("`order_status` >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`order_status` >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("`order_status` <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`order_status` <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("`order_status` in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("`order_status` not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("`order_status` between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`order_status` not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNull() {
            addCriterion("`order_address` is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNotNull() {
            addCriterion("`order_address` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressEqualTo(String value) {
            addCriterion("`order_address` =", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotEqualTo(String value) {
            addCriterion("`order_address` <>", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThan(String value) {
            addCriterion("`order_address` >", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("`order_address` >=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThan(String value) {
            addCriterion("`order_address` <", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThanOrEqualTo(String value) {
            addCriterion("`order_address` <=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLike(String value) {
            addCriterion("`order_address` like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotLike(String value) {
            addCriterion("`order_address` not like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIn(List<String> values) {
            addCriterion("`order_address` in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotIn(List<String> values) {
            addCriterion("`order_address` not in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressBetween(String value1, String value2) {
            addCriterion("`order_address` between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotBetween(String value1, String value2) {
            addCriterion("`order_address` not between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeIsNull() {
            addCriterion("`order_postalfee` is null");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeIsNotNull() {
            addCriterion("`order_postalfee` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeEqualTo(Double value) {
            addCriterion("`order_postalfee` =", value, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeNotEqualTo(Double value) {
            addCriterion("`order_postalfee` <>", value, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeGreaterThan(Double value) {
            addCriterion("`order_postalfee` >", value, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("`order_postalfee` >=", value, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeLessThan(Double value) {
            addCriterion("`order_postalfee` <", value, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeLessThanOrEqualTo(Double value) {
            addCriterion("`order_postalfee` <=", value, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeIn(List<Double> values) {
            addCriterion("`order_postalfee` in", values, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeNotIn(List<Double> values) {
            addCriterion("`order_postalfee` not in", values, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeBetween(Double value1, Double value2) {
            addCriterion("`order_postalfee` between", value1, value2, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderPostalfeeNotBetween(Double value1, Double value2) {
            addCriterion("`order_postalfee` not between", value1, value2, "orderPostalfee");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("`order_date` is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("`order_date` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterionForJDBCDate("`order_date` =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("`order_date` <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("`order_date` >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`order_date` >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("`order_date` <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`order_date` <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("`order_date` in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("`order_date` not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`order_date` between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`order_date` not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeIsNull() {
            addCriterion("`order_postcode` is null");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeIsNotNull() {
            addCriterion("`order_postcode` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeEqualTo(String value) {
            addCriterion("`order_postcode` =", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeNotEqualTo(String value) {
            addCriterion("`order_postcode` <>", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeGreaterThan(String value) {
            addCriterion("`order_postcode` >", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("`order_postcode` >=", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeLessThan(String value) {
            addCriterion("`order_postcode` <", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeLessThanOrEqualTo(String value) {
            addCriterion("`order_postcode` <=", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeLike(String value) {
            addCriterion("`order_postcode` like", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeNotLike(String value) {
            addCriterion("`order_postcode` not like", value, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeIn(List<String> values) {
            addCriterion("`order_postcode` in", values, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeNotIn(List<String> values) {
            addCriterion("`order_postcode` not in", values, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeBetween(String value1, String value2) {
            addCriterion("`order_postcode` between", value1, value2, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostcodeNotBetween(String value1, String value2) {
            addCriterion("`order_postcode` not between", value1, value2, "orderPostcode");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameIsNull() {
            addCriterion("`order_postname` is null");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameIsNotNull() {
            addCriterion("`order_postname` is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameEqualTo(String value) {
            addCriterion("`order_postname` =", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameNotEqualTo(String value) {
            addCriterion("`order_postname` <>", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameGreaterThan(String value) {
            addCriterion("`order_postname` >", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameGreaterThanOrEqualTo(String value) {
            addCriterion("`order_postname` >=", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameLessThan(String value) {
            addCriterion("`order_postname` <", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameLessThanOrEqualTo(String value) {
            addCriterion("`order_postname` <=", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameLike(String value) {
            addCriterion("`order_postname` like", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameNotLike(String value) {
            addCriterion("`order_postname` not like", value, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameIn(List<String> values) {
            addCriterion("`order_postname` in", values, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameNotIn(List<String> values) {
            addCriterion("`order_postname` not in", values, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameBetween(String value1, String value2) {
            addCriterion("`order_postname` between", value1, value2, "orderPostname");
            return (Criteria) this;
        }

        public Criteria andOrderPostnameNotBetween(String value1, String value2) {
            addCriterion("`order_postname` not between", value1, value2, "orderPostname");
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