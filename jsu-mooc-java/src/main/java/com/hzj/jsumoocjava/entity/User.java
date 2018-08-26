package com.hzj.jsumoocjava.entity;
public class User {
    private Integer userId;            //账户
    private String userPassword;       //账户密码
    private String userNickname;       //用户昵称
    private String userSex;            //用户性别
    private String userPhone;          //用户手机号
    private String userEmail;          //用户邮箱
    private String userSignature;      //用户个性签名
    private String userCity;           //用户所属城市
    private String userPost;           //用户所属职位(xx工程师)

    public User() {
    }

    public User(Integer userId, String userPassword, String userNickname, String userSex, String userPhone, String userEmail, String userSignature, String userCity, String userPost) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userNickname = userNickname;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userSignature = userSignature;
        this.userCity = userCity;
        this.userPost = userPost;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userPassword='" + userPassword + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userSignature='" + userSignature + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userPost='" + userPost + '\'' +
                '}';
    }
}
