package com.greatlearning.denomination.service;

public class CurrencyCounter {

	public void countCurrency(int amount, int[] currDenominations, int size) {
		int[] Counter = new int[size];

		for (int i = 0; i < size; i++) {
			if (amount >= currDenominations[i]) {
				Counter[i] = amount / currDenominations[i];
				amount = amount - Counter[i] * currDenominations[i];
			}
		}

		for (int i = 0; i < size; i++) {
			if (Counter[i] != 0) {
				System.out.println("Your payment approach in order to give min no of notes will be " + "\n"
						+ currDenominations[i] + " : " + Counter[i]);
			}
		}
	}

}
