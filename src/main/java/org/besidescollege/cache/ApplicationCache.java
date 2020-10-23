package org.besidescollege.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import org.besidescollege.database.DataBaseMock;
import org.besidescollege.domain.Account;
import org.besidescollege.domain.Fund;

/**
 * Central place that will hold cached data.
 * Don't worry about which cache technology is used.
 */
public class ApplicationCache {

    private ConcurrentMap<String, Fund> fundCache;
    private ConcurrentMap<String, Account> accountCache;
    private CacheProviderAdaptor cacheProvider;

    public ApplicationCache(CacheProviderAdaptor provider) {
        this.cacheProvider = provider;
    }

    /**
     * Should be called on start of application
     */
    public void populateFund() {
        fundCache = (ConcurrentMap<String, Fund>) cacheProvider.getMap("fundCache");

        Map<String, Fund> fetchedFromDB = DataBaseMock.getFunds();
        for (String code : fetchedFromDB.keySet())
            fundCache.put(code, fetchedFromDB.get(code));
    }

    /**
     * Should be called on start of application
     */
    public void populateAccount() {
        accountCache = (ConcurrentMap<String, Account>) cacheProvider.getMap("accountCache");

        Map<String, Account> fetchedFromDB = DataBaseMock.getAccounts();
        for (String code : fetchedFromDB.keySet())
            accountCache.put(code, fetchedFromDB.get(code));
    }

    public Map<String, Fund> getFunds() {
        return cacheProvider.getMap("fundCache");
    }

    public Map<String, Account> getAccounts() {
        return cacheProvider.getMap("accountCache");
    }

}
