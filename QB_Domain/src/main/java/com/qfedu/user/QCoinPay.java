package com.qfedu.user;

import java.util.Date;

/**
 * @ProjectName QBTransaction
 * @Author: 大神船
 * @Date: Created in 2018/7/30 23:51
 * @Version 1.0
 * 千币消费记录表
 */
public class QCoinPay {
    private int id;
    private int uid;
    private double qcoin;   //本次卖出或者买入的千币金额
    private Date createtime;    //创建时间
    private int type;   //1为买入，2为卖出

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

    public double getQcoin() {
        return qcoin;
    }

    public void setQcoin(double qcoin) {
        this.qcoin = qcoin;
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
