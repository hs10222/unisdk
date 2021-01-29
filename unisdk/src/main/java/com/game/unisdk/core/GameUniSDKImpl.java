package com.game.unisdk.core;

import android.app.Activity;

import com.game.unisdk.common.IGameUniSDK;
import com.game.unisdk.listener.UniInitListener;
import com.game.unisdk.listener.UniLoginListener;
import com.game.unisdk.listener.UniLogoutListener;

/**
 * Created by Pawns on 2021/1/27
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public class GameUniSDKImpl implements IGameUniSDK {
    @Override
    public void init(Activity activity, UniInitListener listener) {

    }

    @Override
    public void login(UniLoginListener listener) {

    }

    @Override
    public void pay(String price, String currency, String orderId, String callbackUrl) {

    }

    @Override
    public void purchase(String sku, String orderId, String callbackUrl) {

    }

    @Override
    public void logout(UniLogoutListener listener) {

    }
}
