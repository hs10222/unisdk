package com.game.unisdk.model;

import java.io.Serializable;

/**
 * @author pawns
 * @date 2021/1/28
 */
public class UniPayInfo extends BasePayInfo implements Serializable {

    private static final long serialVersionUID = 8767834833118424230L;

    /**
     * 托管支付的product id
     */
    private String mSku;

    public String getSku() {
        return mSku;
    }

    public void setSku(String sku) {
        mSku = sku;
    }
}
