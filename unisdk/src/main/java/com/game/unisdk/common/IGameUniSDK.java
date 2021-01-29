package com.game.unisdk.common;

import android.app.Activity;

import com.game.unisdk.listener.UniInitListener;
import com.game.unisdk.listener.UniLoginListener;
import com.game.unisdk.listener.UniLogoutListener;

/**
 * Created by Pawns on 2021/1/27
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public interface IGameUniSDK {

    void init(Activity activity, UniInitListener listener);
    /**
     * will require when user login
     * @param listener @see LoginListener
     */
    void login(UniLoginListener listener);


    void pay(String price,String currency,String orderId,String callbackUrl);

    void purchase(String sku,String orderId,String callbackUrl);
    /**
     * will require when user logout
     * @param listener
     */
    void logout(UniLogoutListener listener);
}
