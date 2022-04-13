package com.greatlearning.denomination.service;

public class DenominationSort {

	/**
	 * 
	 * @param currDenominations will store the array of multiple denomination notes
	 * @param size              will store the size or no of notes
	 */
	public void mergeSort(int[] currDenominations, int size) {
		if (size < 2) {
			return;
		}
		int mid = size / 2;
		int[] l = new int[mid];
		int[] r = new int[size - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = currDenominations[i];
		}
		for (int i = mid; i < size; i++) {
			r[i - mid] = currDenominations[i];
		}
		mergeSort(l, mid);
		mergeSort(r, size - mid);

		merge(currDenominations, l, r, mid, size - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

}
