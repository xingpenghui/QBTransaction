package com.qfedu.user;

/**
 * @ProjectName QBTransaction
 * @Author: 大神船
 * @Date: Created in 2018/7/30 23:50
 * @Version 1.0
 * 千币余额表
 */
public class QCoin {
    private int id;
    private int uid;
    private double qcoin;   //当前千币余额

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
}
