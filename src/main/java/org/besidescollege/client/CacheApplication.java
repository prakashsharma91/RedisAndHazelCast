package org.besidescollege.client;

import org.besidescollege.cache.ApplicationCache;
import org.besidescollege.cache.CacheProviderAdaptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);

		System.out.println(args);

		if (args.length != 1)
			throw new RuntimeException("Which cache to be used?");

		System.out.println("loading using cache: " + args[0]);
		CacheProviderAdaptor cacheProvider = new CacheProviderAdaptor(args[0].split("=")[1]);

		ApplicationCache cache = new ApplicationCache(cacheProvider);

		// Cache consumer
		System.out.println(cache.getAccounts());
	}

}
