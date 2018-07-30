package com.qfedu.user;

/**
 * @ProjectName QBTransaction
 * @Author: 大神船
 * @Date: Created in 2018/7/30 23:53
 * @Version 1.0
 * 银行卡表
 */
public class BankCard {
    private int id;
    private int uid;    //所属用户Id
    private int cardId; //银行卡号
    private int type;   //银行卡类型

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

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
