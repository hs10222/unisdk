package com.game.unisdk.model;

import java.io.Serializable;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public class UniAccount implements Serializable {

    private static final long serialVersionUID = 234567582354371264L;
    private String mUid;
    private String mToken;
    private String mUserName;

    public String getUid() {
        return mUid;
    }

    public void setUid(String uid) {
        this.mUid = uid;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String token) {
        this.mToken = token;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String username) {
        this.mUserName = username;
    }
}
