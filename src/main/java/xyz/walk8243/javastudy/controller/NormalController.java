package xyz.walk8243.javastudy.controller;

import xyz.walk8243.javastudy.lib.PrimeNumber;

public class NormalController {
	public void execute() {
		Integer poolNum = 5;
		PrimeNumber primeNumber = new PrimeNumber();
		for (int i = 0; i < poolNum; i++) {
			primeNumber.get((int)Math.pow(2, 16));
		}
	}
}
