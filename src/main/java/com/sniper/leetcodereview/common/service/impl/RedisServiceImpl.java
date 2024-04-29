package com.sniper.leetcodereview.common.service.impl;

import com.sniper.leetcodereview.common.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author sniper
 * @Date 2024/4/29 11:10 AM
 **/
@Service
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public void set(String key, Object value, long time) {
        redisTemplate.opsForValue().set(key,value,time);
    }

    @Override
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
