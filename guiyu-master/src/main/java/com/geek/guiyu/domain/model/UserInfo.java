package com.geek.guiyu.domain.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.create_time
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.update_time
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.deleted
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Byte deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.account
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.phone
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.avatar_url
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.fans
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Integer fans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.nick_name
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.sex
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Byte sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.birthday
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.location
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.school
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String school;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.occupation
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String occupation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.introduce
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String introduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.background_image
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private String backgroundImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.create_time
     *
     * @return the value of user_info.create_time
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.create_time
     *
     * @param createTime the value for user_info.create_time
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.update_time
     *
     * @return the value of user_info.update_time
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.update_time
     *
     * @param updateTime the value for user_info.update_time
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.deleted
     *
     * @return the value of user_info.deleted
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.deleted
     *
     * @param deleted the value for user_info.deleted
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.account
     *
     * @return the value of user_info.account
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.account
     *
     * @param account the value for user_info.account
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.phone
     *
     * @return the value of user_info.phone
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.phone
     *
     * @param phone the value for user_info.phone
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.avatar_url
     *
     * @return the value of user_info.avatar_url
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.avatar_url
     *
     * @param avatarUrl the value for user_info.avatar_url
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.fans
     *
     * @return the value of user_info.fans
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Integer getFans() {
        return fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.fans
     *
     * @param fans the value for user_info.fans
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setFans(Integer fans) {
        this.fans = fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.nick_name
     *
     * @return the value of user_info.nick_name
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.nick_name
     *
     * @param nickName the value for user_info.nick_name
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.sex
     *
     * @return the value of user_info.sex
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.sex
     *
     * @param sex the value for user_info.sex
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.birthday
     *
     * @return the value of user_info.birthday
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.birthday
     *
     * @param birthday the value for user_info.birthday
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.location
     *
     * @return the value of user_info.location
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.location
     *
     * @param location the value for user_info.location
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.school
     *
     * @return the value of user_info.school
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.school
     *
     * @param school the value for user_info.school
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.occupation
     *
     * @return the value of user_info.occupation
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.occupation
     *
     * @param occupation the value for user_info.occupation
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.introduce
     *
     * @return the value of user_info.introduce
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.introduce
     *
     * @param introduce the value for user_info.introduce
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.background_image
     *
     * @return the value of user_info.background_image
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.background_image
     *
     * @param backgroundImage the value for user_info.background_image
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Feb 14 19:41:30 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", account=").append(account);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", fans=").append(fans);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", location=").append(location);
        sb.append(", school=").append(school);
        sb.append(", occupation=").append(occupation);
        sb.append(", introduce=").append(introduce);
        sb.append(", backgroundImage=").append(backgroundImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}