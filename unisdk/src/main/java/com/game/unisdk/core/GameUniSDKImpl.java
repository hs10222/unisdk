package com.game.unisdk.core;

import android.app.Activity;

import com.game.unisdk.interfaces.IGameUniSDK;
import com.game.unisdk.listener.InitListener;
import com.game.unisdk.listener.LoginListener;
import com.game.unisdk.listener.LogoutListener;

/**
 * Created by Pawns on 2021/1/27
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public class GameUniSDKImpl implements IGameUniSDK {
    @Override
    public void init(Activity activity, InitListener listener) {

    }

    @Override
    public void login(LoginListener listener) {

    }

    @Override
    public void pay(String price, String currency, String orderId, String callbackUrl) {

    }

    @Override
    public void purchase(String sku, String orderId, String callbackUrl) {

    }

    @Override
    public void logout(LogoutListener listener) {

    }
}
