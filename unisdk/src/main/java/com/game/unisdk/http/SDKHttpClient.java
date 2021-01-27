package com.game.unisdk.http;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public class SDKHttpClient {

    private static SDKHttpClient sInstance = new SDKHttpClient();
    private ThreadPoolExecutor mPoolExecutor;
    private SDKHttpClient(){
        mPoolExecutor = new ThreadPoolExecutor(5,5,
                5000, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<Runnable>());
    }

    public static SDKHttpClient getInstance() {
        return sInstance;
    }


}
