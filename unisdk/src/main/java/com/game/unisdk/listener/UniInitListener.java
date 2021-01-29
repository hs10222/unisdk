package com.game.unisdk.listener;

import com.game.unisdk.model.UniErrorCode;
import com.game.unisdk.model.UniErrorMsg;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public interface UniInitListener {
    /**
     * the callback that init result
     * @param code { CODE_UNI_SDK_INIT_SUCCESS or CODE_UNI_SDK_INIT_FAILED }
     * @see UniErrorCode
     * @param msg {MSG_UNI_SDK_INIT_SUCCESS or MSG_UNI_SDK_INIT_FAILED}
     * @see UniErrorMsg
     */
    void onInitListener(int code,String msg);
}
