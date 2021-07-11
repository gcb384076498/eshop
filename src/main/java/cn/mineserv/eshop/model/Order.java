package cn.mineserv.eshop.model;

import java.io.Serializable;
import java.util.Date;

/**
    * InnoDB free: 6144 kB; (`goods_id`) REFER `mybatis/t_goods`; 
    */
public class Order implements Serializable {
    private Integer orderId;

    private String orderCode;

    private Integer userId;

    private Integer orderStatus;

    private String orderAddress;

    private Double orderPostalfee;

    private Date orderDate;

    private String orderPostcode;

    private String orderPostname;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public Double getOrderPostalfee() {
        return orderPostalfee;
    }

    public void setOrderPostalfee(Double orderPostalfee) {
        this.orderPostalfee = orderPostalfee;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderPostcode() {
        return orderPostcode;
    }

    public void setOrderPostcode(String orderPostcode) {
        this.orderPostcode = orderPostcode == null ? null : orderPostcode.trim();
    }

    public String getOrderPostname() {
        return orderPostname;
    }

    public void setOrderPostname(String orderPostname) {
        this.orderPostname = orderPostname == null ? null : orderPostname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", userId=").append(userId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderAddress=").append(orderAddress);
        sb.append(", orderPostalfee=").append(orderPostalfee);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", orderPostcode=").append(orderPostcode);
        sb.append(", orderPostname=").append(orderPostname);
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getOrderAddress() == null ? other.getOrderAddress() == null : this.getOrderAddress().equals(other.getOrderAddress()))
            && (this.getOrderPostalfee() == null ? other.getOrderPostalfee() == null : this.getOrderPostalfee().equals(other.getOrderPostalfee()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getOrderPostcode() == null ? other.getOrderPostcode() == null : this.getOrderPostcode().equals(other.getOrderPostcode()))
            && (this.getOrderPostname() == null ? other.getOrderPostname() == null : this.getOrderPostname().equals(other.getOrderPostname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getOrderAddress() == null) ? 0 : getOrderAddress().hashCode());
        result = prime * result + ((getOrderPostalfee() == null) ? 0 : getOrderPostalfee().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getOrderPostcode() == null) ? 0 : getOrderPostcode().hashCode());
        result = prime * result + ((getOrderPostname() == null) ? 0 : getOrderPostname().hashCode());
        return result;
    }
}