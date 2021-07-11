package cn.mineserv.eshop.model;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer addrId;

    private Integer userId;

    private String addrProvince;

    private String addrCity;

    private String addrArea;

    private String addrContent;

    private String addrReceiver;

    private String addrTel;

    private Integer addrIsdefault;

    private static final long serialVersionUID = 1L;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince == null ? null : addrProvince.trim();
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    public String getAddrArea() {
        return addrArea;
    }

    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea == null ? null : addrArea.trim();
    }

    public String getAddrContent() {
        return addrContent;
    }

    public void setAddrContent(String addrContent) {
        this.addrContent = addrContent == null ? null : addrContent.trim();
    }

    public String getAddrReceiver() {
        return addrReceiver;
    }

    public void setAddrReceiver(String addrReceiver) {
        this.addrReceiver = addrReceiver == null ? null : addrReceiver.trim();
    }

    public String getAddrTel() {
        return addrTel;
    }

    public void setAddrTel(String addrTel) {
        this.addrTel = addrTel == null ? null : addrTel.trim();
    }

    public Integer getAddrIsdefault() {
        return addrIsdefault;
    }

    public void setAddrIsdefault(Integer addrIsdefault) {
        this.addrIsdefault = addrIsdefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addrId=").append(addrId);
        sb.append(", userId=").append(userId);
        sb.append(", addrProvince=").append(addrProvince);
        sb.append(", addrCity=").append(addrCity);
        sb.append(", addrArea=").append(addrArea);
        sb.append(", addrContent=").append(addrContent);
        sb.append(", addrReceiver=").append(addrReceiver);
        sb.append(", addrTel=").append(addrTel);
        sb.append(", addrIsdefault=").append(addrIsdefault);
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
        Address other = (Address) that;
        return (this.getAddrId() == null ? other.getAddrId() == null : this.getAddrId().equals(other.getAddrId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAddrProvince() == null ? other.getAddrProvince() == null : this.getAddrProvince().equals(other.getAddrProvince()))
            && (this.getAddrCity() == null ? other.getAddrCity() == null : this.getAddrCity().equals(other.getAddrCity()))
            && (this.getAddrArea() == null ? other.getAddrArea() == null : this.getAddrArea().equals(other.getAddrArea()))
            && (this.getAddrContent() == null ? other.getAddrContent() == null : this.getAddrContent().equals(other.getAddrContent()))
            && (this.getAddrReceiver() == null ? other.getAddrReceiver() == null : this.getAddrReceiver().equals(other.getAddrReceiver()))
            && (this.getAddrTel() == null ? other.getAddrTel() == null : this.getAddrTel().equals(other.getAddrTel()))
            && (this.getAddrIsdefault() == null ? other.getAddrIsdefault() == null : this.getAddrIsdefault().equals(other.getAddrIsdefault()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddrId() == null) ? 0 : getAddrId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAddrProvince() == null) ? 0 : getAddrProvince().hashCode());
        result = prime * result + ((getAddrCity() == null) ? 0 : getAddrCity().hashCode());
        result = prime * result + ((getAddrArea() == null) ? 0 : getAddrArea().hashCode());
        result = prime * result + ((getAddrContent() == null) ? 0 : getAddrContent().hashCode());
        result = prime * result + ((getAddrReceiver() == null) ? 0 : getAddrReceiver().hashCode());
        result = prime * result + ((getAddrTel() == null) ? 0 : getAddrTel().hashCode());
        result = prime * result + ((getAddrIsdefault() == null) ? 0 : getAddrIsdefault().hashCode());
        return result;
    }
}