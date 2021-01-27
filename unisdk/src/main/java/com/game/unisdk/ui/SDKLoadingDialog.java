package com.game.unisdk.ui;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Created by Pawns on 2021/1/28
 * <p>
 * Copyright (c) 2021 echo All rights reserved.
 */
public class SDKLoadingDialog extends AlertDialog {

    protected SDKLoadingDialog(Context context) {
        super(context);
    }

    protected SDKLoadingDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected SDKLoadingDialog(Context context, int themeResId) {
        super(context, themeResId);
    }
}
