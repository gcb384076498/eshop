package cn.mineserv.eshop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Goods implements Serializable {
    private Integer goodsId;

    private Integer cateId;

    private String goodsName;

    private String goodsDisc;

    private Double goodsPrice;

    private Double goodsDiscount;

    private Integer goodsStock;

    private String goodsOrigin;

    private String goodsMaterial;

    private Double goodsPostalfee;

    private Date goodsDate;

    private Integer goodsSales;

    private String goodsPic;

    /**
    * 是否为今日推荐商品，1：是  0：否
    */
    private Boolean istoday;

    private String goodsPicBig;

    private List<Pic> picList;

    private List<GoodsDetailType> goodsDetailTypeList;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsDisc() {
        return goodsDisc;
    }

    public void setGoodsDisc(String goodsDisc) {
        this.goodsDisc = goodsDisc == null ? null : goodsDisc.trim();
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getGoodsOrigin() {
        return goodsOrigin;
    }

    public void setGoodsOrigin(String goodsOrigin) {
        this.goodsOrigin = goodsOrigin == null ? null : goodsOrigin.trim();
    }

    public String getGoodsMaterial() {
        return goodsMaterial;
    }

    public void setGoodsMaterial(String goodsMaterial) {
        this.goodsMaterial = goodsMaterial == null ? null : goodsMaterial.trim();
    }

    public Double getGoodsPostalfee() {
        return goodsPostalfee;
    }

    public void setGoodsPostalfee(Double goodsPostalfee) {
        this.goodsPostalfee = goodsPostalfee;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public Boolean getIstoday() {
        return istoday;
    }

    public void setIstoday(Boolean istoday) {
        this.istoday = istoday;
    }

    public String getGoodsPicBig() {
        return goodsPicBig;
    }

    public void setGoodsPicBig(String goodsPicBig) {
        this.goodsPicBig = goodsPicBig == null ? null : goodsPicBig.trim();
    }

    public List<Pic> getPicList() {
        return picList;
    }

    public void setPicList(List<Pic> picList) {
        this.picList = picList;
    }

    public List<GoodsDetailType> getGoodsDetailType() {
        return goodsDetailTypeList;
    }

    public void setGoodsDetailType(List<GoodsDetailType> goodsDetailTypeList) {
        this.goodsDetailTypeList = goodsDetailTypeList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", cateId=").append(cateId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsDisc=").append(goodsDisc);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsDiscount=").append(goodsDiscount);
        sb.append(", goodsStock=").append(goodsStock);
        sb.append(", goodsOrigin=").append(goodsOrigin);
        sb.append(", goodsMaterial=").append(goodsMaterial);
        sb.append(", goodsPostalfee=").append(goodsPostalfee);
        sb.append(", goodsDate=").append(goodsDate);
        sb.append(", goodsSales=").append(goodsSales);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", istoday=").append(istoday);
        sb.append(", goodsPicBig=").append(goodsPicBig);
        sb.append(", picList=").append(picList);
        sb.append(", goodsDetailTypeList=").append(goodsDetailTypeList);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Goods other = (Goods) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsDisc() == null ? other.getGoodsDisc() == null : this.getGoodsDisc().equals(other.getGoodsDisc()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsDiscount() == null ? other.getGoodsDiscount() == null : this.getGoodsDiscount().equals(other.getGoodsDiscount()))
            && (this.getGoodsStock() == null ? other.getGoodsStock() == null : this.getGoodsStock().equals(other.getGoodsStock()))
            && (this.getGoodsOrigin() == null ? other.getGoodsOrigin() == null : this.getGoodsOrigin().equals(other.getGoodsOrigin()))
            && (this.getGoodsMaterial() == null ? other.getGoodsMaterial() == null : this.getGoodsMaterial().equals(other.getGoodsMaterial()))
            && (this.getGoodsPostalfee() == null ? other.getGoodsPostalfee() == null : this.getGoodsPostalfee().equals(other.getGoodsPostalfee()))
            && (this.getGoodsDate() == null ? other.getGoodsDate() == null : this.getGoodsDate().equals(other.getGoodsDate()))
            && (this.getGoodsSales() == null ? other.getGoodsSales() == null : this.getGoodsSales().equals(other.getGoodsSales()))
            && (this.getGoodsPic() == null ? other.getGoodsPic() == null : this.getGoodsPic().equals(other.getGoodsPic()))
            && (this.getIstoday() == null ? other.getIstoday() == null : this.getIstoday().equals(other.getIstoday()))
            && (this.getGoodsPicBig() == null ? other.getGoodsPicBig() == null : this.getGoodsPicBig().equals(other.getGoodsPicBig()))
            && (this.getPicList() == null ? other.getPicList() == null : this.getPicList().equals(other.getPicList()))
            && (this.getGoodsDetailType() == null ? other.getGoodsDetailType() == null : this.getGoodsDetailType().equals(other.getGoodsDetailType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getCateId() == null) ? 0 : getCateId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsDisc() == null) ? 0 : getGoodsDisc().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsDiscount() == null) ? 0 : getGoodsDiscount().hashCode());
        result = prime * result + ((getGoodsStock() == null) ? 0 : getGoodsStock().hashCode());
        result = prime * result + ((getGoodsOrigin() == null) ? 0 : getGoodsOrigin().hashCode());
        result = prime * result + ((getGoodsMaterial() == null) ? 0 : getGoodsMaterial().hashCode());
        result = prime * result + ((getGoodsPostalfee() == null) ? 0 : getGoodsPostalfee().hashCode());
        result = prime * result + ((getGoodsDate() == null) ? 0 : getGoodsDate().hashCode());
        result = prime * result + ((getGoodsSales() == null) ? 0 : getGoodsSales().hashCode());
        result = prime * result + ((getGoodsPic() == null) ? 0 : getGoodsPic().hashCode());
        result = prime * result + ((getIstoday() == null) ? 0 : getIstoday().hashCode());
        result = prime * result + ((getGoodsPicBig() == null) ? 0 : getGoodsPicBig().hashCode());
        result = prime * result + ((getPicList() == null) ? 0 : getPicList().hashCode());
        result = prime * result + ((getGoodsDetailType() == null) ? 0 : getGoodsDetailType().hashCode());
        return result;
    }
}