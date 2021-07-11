package cn.mineserv.eshop.model;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {
    private Integer cateId;

    private String cateName;

    private String catePic;

    private Integer parentid;

    private String cateDesc;

    private List<Category> childCategory;

    private List<Goods> goodsList;

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCatePic() {
        return catePic;
    }

    public void setCatePic(String catePic) {
        this.catePic = catePic == null ? null : catePic.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getCateDesc() {
        return cateDesc;
    }

    public void setCateDesc(String cateDesc) {
        this.cateDesc = cateDesc == null ? null : cateDesc.trim();
    }

    public List<Category> getChildCategory() {
        return childCategory;
    }

    public void setChildCategory(List<Category> childCategory) {
        this.childCategory = childCategory;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cateId=").append(cateId);
        sb.append(", cateName=").append(cateName);
        sb.append(", catePic=").append(catePic);
        sb.append(", parentid=").append(parentid);
        sb.append(", cateDesc=").append(cateDesc);
        sb.append(", childCategory=").append(childCategory);
        sb.append(", goodsList=").append(goodsList);
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
        Category other = (Category) that;
        return (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
            && (this.getCateName() == null ? other.getCateName() == null : this.getCateName().equals(other.getCateName()))
            && (this.getCatePic() == null ? other.getCatePic() == null : this.getCatePic().equals(other.getCatePic()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getCateDesc() == null ? other.getCateDesc() == null : this.getCateDesc().equals(other.getCateDesc()))
            && (this.getGoodsList() == null ? other.getGoodsList() == null : this.getGoodsList().equals(other.getGoodsList()))
            && (this.getChildCategory() == null ? other.getChildCategory() == null : this.getChildCategory().equals(other.getChildCategory()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCateId() == null) ? 0 : getCateId().hashCode());
        result = prime * result + ((getCateName() == null) ? 0 : getCateName().hashCode());
        result = prime * result + ((getCatePic() == null) ? 0 : getCatePic().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getCateDesc() == null) ? 0 : getCateDesc().hashCode());
        result = prime * result + ((getChildCategory() == null) ? 0 : getChildCategory().hashCode());
        result = prime * result + ((getGoodsList() == null) ? 0 : getGoodsList().hashCode());
        return result;
    }
}