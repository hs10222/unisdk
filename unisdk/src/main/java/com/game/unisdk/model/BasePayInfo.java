package com.game.unisdk.model;

import java.io.Serializable;

/**
 * @author pawns
 * @date 2021/1/28
 */
public class BasePayInfo implements Serializable {

    private static final long serialVersionUID = -6154917284715919353L;

    /**
     * 商品名称
     */
    private String mItemName;
    /**
     * 商品价格
     */
    private double mPrice;
    /**
     * 商品数量
     */
    private String mCount;
    /**
     * 货币类型
     */
    private String mCurrency;
    /**
     * 回调地址
     */
    private String mCallbackUrl;
    /**
     * 回调确认信息
     */
    private String mCallbackInfo;

    public String getItemName() {
        return mItemName;
    }

    public void setItemName(String itemName) {
        mItemName = itemName;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getCount() {
        return mCount;
    }

    public void setCount(String count) {
        mCount = count;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getCallbackUrl() {
        return mCallbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        mCallbackUrl = callbackUrl;
    }

    public String getCallbackInfo() {
        return mCallbackInfo;
    }

    public void setCallbackInfo(String callbackInfo) {
        mCallbackInfo = callbackInfo;
    }
}
