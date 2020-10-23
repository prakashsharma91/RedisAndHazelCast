package org.besidescollege.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelCastCache {

    private HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

    public HazelCastCache() {
        System.out.println("HC Cache initialized");
    }

    public HazelcastInstance getInstace() {
        return hazelcastInstance;
    }
}
