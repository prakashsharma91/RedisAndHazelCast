package org.besidescollege.cache;

import java.util.Map;

import org.besidescollege.hazelcast.HazelCastCache;
import org.besidescollege.redis.RedisCache;
import org.redisson.api.LocalCachedMapOptions;

public class CacheProviderAdaptor {

    String type;
    HazelCastCache hazelCastCache;
    RedisCache redisCache;

    public CacheProviderAdaptor(String type) {
        this.type = type.toLowerCase();

        if ("hc".equals(type))
            hazelCastCache = new HazelCastCache();
        else if ("redis".equals(type))
            redisCache = new RedisCache();
        else
            throw new RuntimeException();
    }

    public Map getMap(String name) {
        if ("hc".equals(type))
            return hazelCastCache.getInstace().getMap(name);
        else
            return redisCache.getInstance().getLocalCachedMap(name, LocalCachedMapOptions.defaults());
    }
}
