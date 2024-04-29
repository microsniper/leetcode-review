package com.sniper.leetcodereview.common.service;

public interface RedisService {

    /**
     * 保存属性
     */
    void set(String key, Object value, long time);
    /**
     * 保存属性
     */
    void set(String key, Object value);

    /**
     * 获取属性
     */
    Object get(String key);
}
