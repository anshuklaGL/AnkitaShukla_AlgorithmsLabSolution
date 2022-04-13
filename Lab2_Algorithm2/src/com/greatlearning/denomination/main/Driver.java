package com.greatlearning.denomination.main;

import java.util.Scanner;

import com.greatlearning.denomination.service.CurrencyCounter;
import com.greatlearning.denomination.service.DenominationSort;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		int n = sc.nextInt();

		int notes[] = new int[n];
		int[] sortedasc = new int[n];

		System.out.println("Enter the currency denominations value");

		for (int i = 0; i < n; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		sortedasc = reverse(notes, n);

		DenominationSort dsort = new DenominationSort();
		dsort.mergeSort(notes, n);
		CurrencyCounter counter = new CurrencyCounter();
		counter.countCurrency(amount, sortedasc, n);

	}

	// Reverse sorted array for it to in descending order
	static int[] reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		return b;

	}
}