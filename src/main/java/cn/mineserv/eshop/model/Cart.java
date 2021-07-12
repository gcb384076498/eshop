package cn.mineserv.eshop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 爱吃蛋白的丶圆周率
 * @company 圆周率有限公司
 */
public class Cart implements Serializable {
    private Goods goods;
    private Integer number;
    private Date addDate;

    private List<GoodsDetailType> goodsDetailTypeList;

    private List<GoodsDetail> goodsDetailList;

    public Cart() {
    }

    public Cart(Goods goods, Integer number, Date addDate, List<GoodsDetailType> goodsDetailTypeList, List<GoodsDetail> goodsDetailList) {
        this.goods = goods;
        this.number = number;
        this.addDate = addDate;
        this.goodsDetailTypeList = goodsDetailTypeList;
        this.goodsDetailList = goodsDetailList;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public List<GoodsDetailType> getGoodsDetailTypeList() {
        return goodsDetailTypeList;
    }

    public void setGoodsDetailTypeList(List<GoodsDetailType> goodsDetailTypeList) {
        this.goodsDetailTypeList = goodsDetailTypeList;
    }

    public List<GoodsDetail> getGoodsDetailList() {
        return goodsDetailList;
    }

    public void setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
        this.goodsDetailList = goodsDetailList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "goods=" + goods +
                ", number=" + number +
                ", addDate=" + addDate +
                ", goodsDetailTypeList=" + goodsDetailTypeList +
                ", goodsDetailList=" + goodsDetailList +
                '}';
    }
}
