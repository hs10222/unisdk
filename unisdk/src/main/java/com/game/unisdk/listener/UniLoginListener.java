package com.game.unisdk.listener;

import com.game.unisdk.model.UniAccount;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public interface UniLoginListener {
    /**
     * login success callback
     * @param account @see Account
     */
    void onLoginSuccess(UniAccount account);

    /**
     * return the callback when login fail
     */
    void onLoginFail();

    /**
     * return the callback when login cancel
     */
    void onLoginCancel();
}
