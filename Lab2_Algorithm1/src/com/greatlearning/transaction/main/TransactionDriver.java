package com.greatlearning.transaction.main;

import java.util.Scanner;

import com.greatlearning.transaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransactionService tr = new TransactionService();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		int trarray[] = new int[size];

		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++) {
			trarray[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalTargets = sc.nextInt();

		for (int i = 0; i < totalTargets; i++) {

			System.out.println("Enter the value of target");
			int target = sc.nextInt();

			int n = tr.transaction(trarray, target);

			if (n == -1) {
				System.out.println("Given target is not achieved");
			}

			else {
				System.out.println("Target " + i + " i.e " + target + " is achieved after " + n + " transactions");
			}

		}

	}

}
