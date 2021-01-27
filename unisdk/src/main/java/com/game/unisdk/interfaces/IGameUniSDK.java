package com.game.unisdk.interfaces;

import android.app.Activity;

import com.game.unisdk.listener.InitListener;
import com.game.unisdk.listener.LoginListener;
import com.game.unisdk.listener.LogoutListener;

/**
 * Created by Pawns on 2021/1/27
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public interface IGameUniSDK {

    void init(Activity activity, InitListener listener);
    /**
     * will require when user login
     * @param listener @see LoginListener
     */
    void login(LoginListener listener);


    void pay(String price,String currency,String orderId,String callbackUrl);

    void purchase(String sku,String orderId,String callbackUrl);
    /**
     * will require when user logout
     * @param listener
     */
    void logout(LogoutListener listener);
}
