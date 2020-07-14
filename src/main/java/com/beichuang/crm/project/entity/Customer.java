package com.beichuang.crm.project.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanghao
 * @since 2020-07-14
 */
@TableName("sys_customer")
public class Customer extends Model<Customer> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;
    /**
     * 孩子姓名
     */
    @TableField("c_name")
    private String cName;
    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;
    /**
     * 出生年月
     */
    private String birthday;
    /**
     * 电话
     */
    private String phone;
    /**
     * 性别:0男,1女
     */
    private Integer sex;
    /**
     * 客户类型:0正常,1潜在客户
     */
    @TableField("c_type")
    private Integer cType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 跟进时间
     */
    @TableField("follow_time")
    private Date followTime;
    /**
     * 签约时间
     */
    @TableField("sign_time")
    private Date signTime;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;


    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getcType() {
        return cType;
    }

    public void setcType(Integer cType) {
        this.cType = cType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "cId=" + cId +
        ", cName=" + cName +
        ", nickName=" + nickName +
        ", birthday=" + birthday +
        ", phone=" + phone +
        ", sex=" + sex +
        ", cType=" + cType +
        ", remark=" + remark +
        ", followTime=" + followTime +
        ", signTime=" + signTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
