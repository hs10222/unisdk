package com.game.unisdk.common;

import android.content.Context;

/**
 * @author pawns
 * @date 2021/1/28
 */
public interface IUniRoleData {

    /**
     * 设置角色信息
     * @param context 上下文
     * @param roleId 角色id
     * @param roleName 角色名称
     * @param roleLevel 角色等级
     * @param zoneId 区服id
     * @param zoneName 区服名称
     */
    void setRoleData(Context context, String roleId, String roleName, String roleLevel,
                     String zoneId,String zoneName);

    /**
     * 扩展接口
     * @param context 上下文
     * @param key key
     * @param value value
     */
    void setData(Context context, String key, Object value);

    /**
     * 获取数据
     * @param context 上下文
     * @param key key
     * @param value value
     */
    void getData(Context context, String key, Object value);
}
