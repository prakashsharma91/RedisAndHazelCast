package org.besidescollege.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisCache {

    Config config;
    RedissonClient client;

    public RedisCache() {
        config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        client = Redisson.create(config);
        System.out.println("Redis Cache initialized");
    }

    public RedissonClient getInstance() {
        return client;
    }
}
