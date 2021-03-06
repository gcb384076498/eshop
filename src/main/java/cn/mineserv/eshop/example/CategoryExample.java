package cn.mineserv.eshop.example;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCateIdIsNull() {
            addCriterion("`cate_id` is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("`cate_id` is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("`cate_id` =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("`cate_id` <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("`cate_id` >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`cate_id` >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("`cate_id` <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("`cate_id` <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("`cate_id` in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("`cate_id` not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("`cate_id` between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`cate_id` not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNull() {
            addCriterion("`cate_name` is null");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNotNull() {
            addCriterion("`cate_name` is not null");
            return (Criteria) this;
        }

        public Criteria andCateNameEqualTo(String value) {
            addCriterion("`cate_name` =", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotEqualTo(String value) {
            addCriterion("`cate_name` <>", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThan(String value) {
            addCriterion("`cate_name` >", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThanOrEqualTo(String value) {
            addCriterion("`cate_name` >=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThan(String value) {
            addCriterion("`cate_name` <", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThanOrEqualTo(String value) {
            addCriterion("`cate_name` <=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLike(String value) {
            addCriterion("`cate_name` like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotLike(String value) {
            addCriterion("`cate_name` not like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameIn(List<String> values) {
            addCriterion("`cate_name` in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotIn(List<String> values) {
            addCriterion("`cate_name` not in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameBetween(String value1, String value2) {
            addCriterion("`cate_name` between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotBetween(String value1, String value2) {
            addCriterion("`cate_name` not between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andCatePicIsNull() {
            addCriterion("`cate_pic` is null");
            return (Criteria) this;
        }

        public Criteria andCatePicIsNotNull() {
            addCriterion("`cate_pic` is not null");
            return (Criteria) this;
        }

        public Criteria andCatePicEqualTo(String value) {
            addCriterion("`cate_pic` =", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicNotEqualTo(String value) {
            addCriterion("`cate_pic` <>", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicGreaterThan(String value) {
            addCriterion("`cate_pic` >", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicGreaterThanOrEqualTo(String value) {
            addCriterion("`cate_pic` >=", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicLessThan(String value) {
            addCriterion("`cate_pic` <", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicLessThanOrEqualTo(String value) {
            addCriterion("`cate_pic` <=", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicLike(String value) {
            addCriterion("`cate_pic` like", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicNotLike(String value) {
            addCriterion("`cate_pic` not like", value, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicIn(List<String> values) {
            addCriterion("`cate_pic` in", values, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicNotIn(List<String> values) {
            addCriterion("`cate_pic` not in", values, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicBetween(String value1, String value2) {
            addCriterion("`cate_pic` between", value1, value2, "catePic");
            return (Criteria) this;
        }

        public Criteria andCatePicNotBetween(String value1, String value2) {
            addCriterion("`cate_pic` not between", value1, value2, "catePic");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("`parentid` is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("`parentid` is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("`parentid` =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("`parentid` <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("`parentid` >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`parentid` >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("`parentid` <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("`parentid` <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("`parentid` in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("`parentid` not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("`parentid` between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("`parentid` not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCateDescIsNull() {
            addCriterion("`cate_desc` is null");
            return (Criteria) this;
        }

        public Criteria andCateDescIsNotNull() {
            addCriterion("`cate_desc` is not null");
            return (Criteria) this;
        }

        public Criteria andCateDescEqualTo(String value) {
            addCriterion("`cate_desc` =", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescNotEqualTo(String value) {
            addCriterion("`cate_desc` <>", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescGreaterThan(String value) {
            addCriterion("`cate_desc` >", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescGreaterThanOrEqualTo(String value) {
            addCriterion("`cate_desc` >=", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescLessThan(String value) {
            addCriterion("`cate_desc` <", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescLessThanOrEqualTo(String value) {
            addCriterion("`cate_desc` <=", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescLike(String value) {
            addCriterion("`cate_desc` like", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescNotLike(String value) {
            addCriterion("`cate_desc` not like", value, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescIn(List<String> values) {
            addCriterion("`cate_desc` in", values, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescNotIn(List<String> values) {
            addCriterion("`cate_desc` not in", values, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescBetween(String value1, String value2) {
            addCriterion("`cate_desc` between", value1, value2, "cateDesc");
            return (Criteria) this;
        }

        public Criteria andCateDescNotBetween(String value1, String value2) {
            addCriterion("`cate_desc` not between", value1, value2, "cateDesc");
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