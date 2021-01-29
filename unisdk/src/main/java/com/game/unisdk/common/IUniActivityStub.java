package com.game.unisdk.common;

import android.app.Activity;

/**
 * @author pawns
 * @date 2021/1/28
 */
public interface IUniActivityStub {

    void applicationDestroy(Activity activity);
    void applicationInit(Activity activity);
    void onActivityResult(Activity activity, int requestCode, int resultCode);
    void onCreate(Activity activity);
    void onDestroy(Activity activity);
    void onNewIntent(Activity activity);
}
