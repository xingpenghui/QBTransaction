package com.qfedu.user;

import java.util.Date;

/**
 * @ProjectName QBTransaction
 * @Author: 大神船
 * @Date: Created in 2018/7/30 23:48
 * @Version 1.0
 * 现金消费记录表
 */
public class MoneyPay {
    private int id;
    private int uid;
    private double money;   //本次消费或充值金额
    private Date createtime;    //创建时间
    private int type;   // 1为收入，2为支出

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
