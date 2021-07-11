package cn.mineserv.eshop.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("`goods_id` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("`goods_id` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("`goods_id` =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("`goods_id` <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("`goods_id` >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`goods_id` >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("`goods_id` <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("`goods_id` <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("`goods_id` in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("`goods_id` not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("`goods_id` between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`goods_id` not between", value1, value2, "goodsId");
            return (Criteria) this;
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("`goods_name` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("`goods_name` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("`goods_name` =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("`goods_name` <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("`goods_name` >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("`goods_name` >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("`goods_name` <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("`goods_name` <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("`goods_name` like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("`goods_name` not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("`goods_name` in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("`goods_name` not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("`goods_name` between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("`goods_name` not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscIsNull() {
            addCriterion("`goods_disc` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscIsNotNull() {
            addCriterion("`goods_disc` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscEqualTo(String value) {
            addCriterion("`goods_disc` =", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscNotEqualTo(String value) {
            addCriterion("`goods_disc` <>", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscGreaterThan(String value) {
            addCriterion("`goods_disc` >", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscGreaterThanOrEqualTo(String value) {
            addCriterion("`goods_disc` >=", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscLessThan(String value) {
            addCriterion("`goods_disc` <", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscLessThanOrEqualTo(String value) {
            addCriterion("`goods_disc` <=", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscLike(String value) {
            addCriterion("`goods_disc` like", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscNotLike(String value) {
            addCriterion("`goods_disc` not like", value, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscIn(List<String> values) {
            addCriterion("`goods_disc` in", values, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscNotIn(List<String> values) {
            addCriterion("`goods_disc` not in", values, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscBetween(String value1, String value2) {
            addCriterion("`goods_disc` between", value1, value2, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscNotBetween(String value1, String value2) {
            addCriterion("`goods_disc` not between", value1, value2, "goodsDisc");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("`goods_price` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("`goods_price` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("`goods_price` =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("`goods_price` <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("`goods_price` >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("`goods_price` >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("`goods_price` <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("`goods_price` <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("`goods_price` in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("`goods_price` not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("`goods_price` between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("`goods_price` not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIsNull() {
            addCriterion("`goods_discount` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIsNotNull() {
            addCriterion("`goods_discount` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountEqualTo(Double value) {
            addCriterion("`goods_discount` =", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotEqualTo(Double value) {
            addCriterion("`goods_discount` <>", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountGreaterThan(Double value) {
            addCriterion("`goods_discount` >", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("`goods_discount` >=", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountLessThan(Double value) {
            addCriterion("`goods_discount` <", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountLessThanOrEqualTo(Double value) {
            addCriterion("`goods_discount` <=", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIn(List<Double> values) {
            addCriterion("`goods_discount` in", values, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotIn(List<Double> values) {
            addCriterion("`goods_discount` not in", values, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountBetween(Double value1, Double value2) {
            addCriterion("`goods_discount` between", value1, value2, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotBetween(Double value1, Double value2) {
            addCriterion("`goods_discount` not between", value1, value2, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNull() {
            addCriterion("`goods_stock` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNotNull() {
            addCriterion("`goods_stock` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockEqualTo(Integer value) {
            addCriterion("`goods_stock` =", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotEqualTo(Integer value) {
            addCriterion("`goods_stock` <>", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThan(Integer value) {
            addCriterion("`goods_stock` >", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("`goods_stock` >=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThan(Integer value) {
            addCriterion("`goods_stock` <", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThanOrEqualTo(Integer value) {
            addCriterion("`goods_stock` <=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIn(List<Integer> values) {
            addCriterion("`goods_stock` in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotIn(List<Integer> values) {
            addCriterion("`goods_stock` not in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockBetween(Integer value1, Integer value2) {
            addCriterion("`goods_stock` between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("`goods_stock` not between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginIsNull() {
            addCriterion("`goods_origin` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginIsNotNull() {
            addCriterion("`goods_origin` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginEqualTo(String value) {
            addCriterion("`goods_origin` =", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotEqualTo(String value) {
            addCriterion("`goods_origin` <>", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginGreaterThan(String value) {
            addCriterion("`goods_origin` >", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginGreaterThanOrEqualTo(String value) {
            addCriterion("`goods_origin` >=", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginLessThan(String value) {
            addCriterion("`goods_origin` <", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginLessThanOrEqualTo(String value) {
            addCriterion("`goods_origin` <=", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginLike(String value) {
            addCriterion("`goods_origin` like", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotLike(String value) {
            addCriterion("`goods_origin` not like", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginIn(List<String> values) {
            addCriterion("`goods_origin` in", values, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotIn(List<String> values) {
            addCriterion("`goods_origin` not in", values, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginBetween(String value1, String value2) {
            addCriterion("`goods_origin` between", value1, value2, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotBetween(String value1, String value2) {
            addCriterion("`goods_origin` not between", value1, value2, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialIsNull() {
            addCriterion("`goods_material` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialIsNotNull() {
            addCriterion("`goods_material` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialEqualTo(String value) {
            addCriterion("`goods_material` =", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialNotEqualTo(String value) {
            addCriterion("`goods_material` <>", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialGreaterThan(String value) {
            addCriterion("`goods_material` >", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("`goods_material` >=", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialLessThan(String value) {
            addCriterion("`goods_material` <", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialLessThanOrEqualTo(String value) {
            addCriterion("`goods_material` <=", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialLike(String value) {
            addCriterion("`goods_material` like", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialNotLike(String value) {
            addCriterion("`goods_material` not like", value, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialIn(List<String> values) {
            addCriterion("`goods_material` in", values, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialNotIn(List<String> values) {
            addCriterion("`goods_material` not in", values, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialBetween(String value1, String value2) {
            addCriterion("`goods_material` between", value1, value2, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsMaterialNotBetween(String value1, String value2) {
            addCriterion("`goods_material` not between", value1, value2, "goodsMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeIsNull() {
            addCriterion("`goods_postalfee` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeIsNotNull() {
            addCriterion("`goods_postalfee` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeEqualTo(Double value) {
            addCriterion("`goods_postalfee` =", value, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeNotEqualTo(Double value) {
            addCriterion("`goods_postalfee` <>", value, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeGreaterThan(Double value) {
            addCriterion("`goods_postalfee` >", value, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("`goods_postalfee` >=", value, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeLessThan(Double value) {
            addCriterion("`goods_postalfee` <", value, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeLessThanOrEqualTo(Double value) {
            addCriterion("`goods_postalfee` <=", value, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeIn(List<Double> values) {
            addCriterion("`goods_postalfee` in", values, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeNotIn(List<Double> values) {
            addCriterion("`goods_postalfee` not in", values, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeBetween(Double value1, Double value2) {
            addCriterion("`goods_postalfee` between", value1, value2, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsPostalfeeNotBetween(Double value1, Double value2) {
            addCriterion("`goods_postalfee` not between", value1, value2, "goodsPostalfee");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIsNull() {
            addCriterion("`goods_date` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIsNotNull() {
            addCriterion("`goods_date` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDateEqualTo(Date value) {
            addCriterionForJDBCDate("`goods_date` =", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("`goods_date` <>", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("`goods_date` >", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`goods_date` >=", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateLessThan(Date value) {
            addCriterionForJDBCDate("`goods_date` <", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`goods_date` <=", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIn(List<Date> values) {
            addCriterionForJDBCDate("`goods_date` in", values, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("`goods_date` not in", values, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`goods_date` between", value1, value2, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`goods_date` not between", value1, value2, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNull() {
            addCriterion("`goods_sales` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNotNull() {
            addCriterion("`goods_sales` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesEqualTo(Integer value) {
            addCriterion("`goods_sales` =", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotEqualTo(Integer value) {
            addCriterion("`goods_sales` <>", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThan(Integer value) {
            addCriterion("`goods_sales` >", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("`goods_sales` >=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThan(Integer value) {
            addCriterion("`goods_sales` <", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThanOrEqualTo(Integer value) {
            addCriterion("`goods_sales` <=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIn(List<Integer> values) {
            addCriterion("`goods_sales` in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotIn(List<Integer> values) {
            addCriterion("`goods_sales` not in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesBetween(Integer value1, Integer value2) {
            addCriterion("`goods_sales` between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("`goods_sales` not between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIsNull() {
            addCriterion("`goods_pic` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIsNotNull() {
            addCriterion("`goods_pic` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicEqualTo(String value) {
            addCriterion("`goods_pic` =", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotEqualTo(String value) {
            addCriterion("`goods_pic` <>", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicGreaterThan(String value) {
            addCriterion("`goods_pic` >", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicGreaterThanOrEqualTo(String value) {
            addCriterion("`goods_pic` >=", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLessThan(String value) {
            addCriterion("`goods_pic` <", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLessThanOrEqualTo(String value) {
            addCriterion("`goods_pic` <=", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLike(String value) {
            addCriterion("`goods_pic` like", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotLike(String value) {
            addCriterion("`goods_pic` not like", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIn(List<String> values) {
            addCriterion("`goods_pic` in", values, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotIn(List<String> values) {
            addCriterion("`goods_pic` not in", values, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBetween(String value1, String value2) {
            addCriterion("`goods_pic` between", value1, value2, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotBetween(String value1, String value2) {
            addCriterion("`goods_pic` not between", value1, value2, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andIstodayIsNull() {
            addCriterion("`istoday` is null");
            return (Criteria) this;
        }

        public Criteria andIstodayIsNotNull() {
            addCriterion("`istoday` is not null");
            return (Criteria) this;
        }

        public Criteria andIstodayEqualTo(Boolean value) {
            addCriterion("`istoday` =", value, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayNotEqualTo(Boolean value) {
            addCriterion("`istoday` <>", value, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayGreaterThan(Boolean value) {
            addCriterion("`istoday` >", value, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`istoday` >=", value, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayLessThan(Boolean value) {
            addCriterion("`istoday` <", value, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayLessThanOrEqualTo(Boolean value) {
            addCriterion("`istoday` <=", value, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayIn(List<Boolean> values) {
            addCriterion("`istoday` in", values, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayNotIn(List<Boolean> values) {
            addCriterion("`istoday` not in", values, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayBetween(Boolean value1, Boolean value2) {
            addCriterion("`istoday` between", value1, value2, "istoday");
            return (Criteria) this;
        }

        public Criteria andIstodayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`istoday` not between", value1, value2, "istoday");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigIsNull() {
            addCriterion("`goods_pic_big` is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigIsNotNull() {
            addCriterion("`goods_pic_big` is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigEqualTo(String value) {
            addCriterion("`goods_pic_big` =", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigNotEqualTo(String value) {
            addCriterion("`goods_pic_big` <>", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigGreaterThan(String value) {
            addCriterion("`goods_pic_big` >", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigGreaterThanOrEqualTo(String value) {
            addCriterion("`goods_pic_big` >=", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigLessThan(String value) {
            addCriterion("`goods_pic_big` <", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigLessThanOrEqualTo(String value) {
            addCriterion("`goods_pic_big` <=", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigLike(String value) {
            addCriterion("`goods_pic_big` like", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigNotLike(String value) {
            addCriterion("`goods_pic_big` not like", value, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigIn(List<String> values) {
            addCriterion("`goods_pic_big` in", values, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigNotIn(List<String> values) {
            addCriterion("`goods_pic_big` not in", values, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigBetween(String value1, String value2) {
            addCriterion("`goods_pic_big` between", value1, value2, "goodsPicBig");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBigNotBetween(String value1, String value2) {
            addCriterion("`goods_pic_big` not between", value1, value2, "goodsPicBig");
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