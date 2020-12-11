package xyz.walk8243.javastudy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import xyz.walk8243.javastudy.lib.PrimeNumber;

public class ThreadController {
	public void execute() throws Exception {
		Integer poolNum = 5;
		ExecutorService pool = Executors.newFixedThreadPool(poolNum);
		List<Future<?>> list = new ArrayList<Future<?>>();
		PrimeNumber primeNumber = new PrimeNumber();
		for (int i = 0; i < poolNum; i++) {
			Future<?> future = pool.submit(() -> {
				primeNumber.get((int)Math.pow(2, 16));
			});
			list.add(future);
		}
		pool.shutdown();
		for (Future<?> future : list) {
			future.get();
		}
	}
}
