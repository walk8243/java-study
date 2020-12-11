package xyz.walk8243.javastudy.lib;

import java.util.ArrayList;

public class PrimeNumber {
	public ArrayList<Integer> get(Integer n) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);

		for (int i = 3; i <= n; i+=2) {
			Boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag.equals(true)) {
				array.add(i);
			}
		}

		return array;
	}
}
