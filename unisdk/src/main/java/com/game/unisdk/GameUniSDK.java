package com.game.unisdk;

import android.app.Activity;

import com.game.unisdk.core.GameUniSDKImpl;
import com.game.unisdk.common.IGameUniSDK;
import com.game.unisdk.listener.UniInitListener;
import com.game.unisdk.listener.UniLoginListener;
import com.game.unisdk.listener.UniLogoutListener;

/**
 * Created by Pawns on 2021/1/27
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public class GameUniSDK implements IGameUniSDK {

    public static volatile GameUniSDK sInstance;
    private GameUniSDKImpl mGameUniSDKImpl;

    private GameUniSDK(){
        mGameUniSDKImpl = new GameUniSDKImpl();
    }

    public static GameUniSDK getInstance() {
        if (sInstance == null) {
            synchronized (GameUniSDK.class) {
                if (sInstance == null) {
                    sInstance = new GameUniSDK();
                }
            }
        }
        return sInstance;
    }

    @Override
    public void init(Activity activity, UniInitListener listener) {
        mGameUniSDKImpl.init(activity,listener);
    }

    @Override
    public void login(UniLoginListener listener) {
        mGameUniSDKImpl.login(listener);
    }

    @Override
    public void pay(String price, String currency, String orderId, String callbackUrl) {

    }

    @Override
    public void purchase(String sku, String orderId, String callbackUrl) {

    }

    @Override
    public void logout(UniLogoutListener listener) {
        mGameUniSDKImpl.logout(listener);
    }
}
