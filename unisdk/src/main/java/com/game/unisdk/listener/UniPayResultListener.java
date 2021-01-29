package com.game.unisdk.listener;

/**
 * @author pawns
 * @date 2021/1/28
 */
public interface UniPayResultListener {

    void onPaySuccess();

    void onPayFailed();

    void onPayCancel();

    void onOderNo();
}
