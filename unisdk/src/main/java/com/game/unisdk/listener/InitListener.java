package com.game.unisdk.listener;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public interface InitListener {
    /**
     * the callback that init result
     * @param code { CODE_UNI_SDK_INIT_SUCCESS or CODE_UNI_SDK_INIT_FAILED }
     * @see com.game.unisdk.model.ErrorCode
     * @param msg {MSG_UNI_SDK_INIT_SUCCESS or MSG_UNI_SDK_INIT_FAILED}
     * @see com.game.unisdk.model.ErrorMsg
     */
    void onInitListener(int code,String msg);
}
