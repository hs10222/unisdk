package com.game.unisdk.common;

/**
 * @author pawns
 * @date 2021/1/28
 */
public interface IUniAdapterFactory {

    IUniPurchase uniPurchase();
    IUniActivityStub uniStub();
    IUniAccountManager uniAccountManager();
    IUniExiter uniExit();
    IUniRoleData uniRole();
}
