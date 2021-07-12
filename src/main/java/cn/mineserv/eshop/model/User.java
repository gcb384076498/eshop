package cn.mineserv.eshop.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPass;

    private Integer userAge;

    private Integer userSex;

    private String userEmail;

    private Integer userRank;

    private List<Cart> cartList;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserRank() {
        return userRank;
    }

    public void setUserRank(Integer userRank) {
        this.userRank = userRank;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", userEmail='" + userEmail + '\'' +
                ", userRank=" + userRank +
                ", cartList=" + cartList +
                '}';
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPass() == null ? other.getUserPass() == null : this.getUserPass().equals(other.getUserPass()))
            && (this.getUserAge() == null ? other.getUserAge() == null : this.getUserAge().equals(other.getUserAge()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserRank() == null ? other.getUserRank() == null : this.getUserRank().equals(other.getUserRank()))
            && (this.getCartList() == null ? other.getCartList() == null : this.getCartList().equals(other.getCartList()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPass() == null) ? 0 : getUserPass().hashCode());
        result = prime * result + ((getUserAge() == null) ? 0 : getUserAge().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserRank() == null) ? 0 : getUserRank().hashCode());
        result = prime * result + ((getCartList() == null) ? 0 : getCartList().hashCode());
        return result;
    }
}