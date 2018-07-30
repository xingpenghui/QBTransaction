package com.qfedu.user;

import java.util.Date;

/**
 * @ProjectName QBTransaction
 * @Author: 大神船
 * @Date: Created in 2018/7/30 23:32
 * @Version 1.0
 * 用户详情表
 */
public class UserDetail {
    private int id;
    private int uid;
    private String realname;    //用户真实姓名
    private String sex;     //性别
    private String idNumber;    //身份证号
    private Date birthDate;     //出生日期
    private String address;    //籍贯
    private String idimage1;    //身份证正面
    private String idimage2;    //身份证反面
    private Date  createtime;   //注册时间
    private int flag;       //1为有效，2为无效

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdimage1() {
        return idimage1;
    }

    public void setIdimage1(String idimage1) {
        this.idimage1 = idimage1;
    }

    public String getIdimage2() {
        return idimage2;
    }

    public void setIdimage2(String idimage2) {
        this.idimage2 = idimage2;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
