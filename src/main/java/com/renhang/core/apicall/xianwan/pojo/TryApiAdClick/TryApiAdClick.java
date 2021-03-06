package com.renhang.core.apicall.xianwan.pojo.TryApiAdClick;

import lombok.Data;

@Data
public class TryApiAdClick {
    /**
     * 触发事件：UserClick
     */
    private String action;
    /**
     * 1 iPhone 2 安卓
     */
    private String ptype;
    /**
     * IOS 忽略此参数 安卓操作系统版本号 如:29 、28 （android Q 对应 29）获取不到请传0
     */
    private String androidosv;
    /**
     * IOS 忽略此参数 安全联盟OAID （未接入安全联盟请传空字符串“”）
     */
    private String msaoaid;
    /**
     * 设备号 android取IMEI; iphone取IDFA 获取不到请传 0
     */
    private String deviceid;
    /**
     * 渠道用户编号(app中 用户ID)
     */
    private String appsign;
    /**
     * 广告编号
     */
    private String adid;
    /**
     * 用户操作行为 1：下载
     */
    private String ctype;
}
