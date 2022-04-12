package com.greatlearning.transaction.service;

public class TransactionService {

	public int transaction(int trarr[], int target) {

		int sum = 0;
		int lenarr = trarr.length;

		for (int i = 0; i < lenarr; i++) {

			sum = sum + trarr[i];

			if (sum > target) {

				return i + 1;
			}

		}

		return -1;
	}

}
