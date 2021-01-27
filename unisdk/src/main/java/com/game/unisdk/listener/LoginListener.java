package com.game.unisdk.listener;

import com.game.unisdk.model.Account;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public interface LoginListener {
    /**
     * login success callback
     * @param account @see Account
     */
    void onLoginSuccess(Account account);

    /**
     * return the callback when login fail
     */
    void onLoginFail();

    /**
     * return the callback when login cancel
     */
    void onLoginCancel();
}
