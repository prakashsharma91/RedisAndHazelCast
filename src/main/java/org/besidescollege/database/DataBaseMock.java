package org.besidescollege.database;

import java.util.HashMap;
import java.util.Map;

import org.besidescollege.domain.Account;
import org.besidescollege.domain.Fund;

public class DataBaseMock {

    public static Map<String, Account> getAccounts() {
        Account a1 = new Account("Alice");
        Account a2 = new Account("Bob");

        Map<String, Account> accounts = new HashMap<>();
        accounts.put(a1.getName(), a1);
        accounts.put(a2.getName(), a2);
        return accounts;
    }

    public static Map<String, Fund> getFunds() {
        Fund f1 = new Fund("HDFC Top 100", "hdfc-top-100-growth");
        Fund f2 = new Fund("HDFC Large Cap", "kotak-large-cap-growth");

        Map<String, Fund> funds = new HashMap<>();
        funds.put(f1.getCode(), f1);
        funds.put(f2.getCode(), f2);
        return funds;
    }
}
