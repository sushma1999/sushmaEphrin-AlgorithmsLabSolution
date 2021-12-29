package com.greatlearning.lab.session.driver;

import java.util.Scanner;

import com.greatlearning.lab.session.service.CountTheNotes;
import com.greatlearning.lab.session.sort.MergeSort;

public class CurrencyDenomRunner {

	static int[] notesCounter;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		MergeSort ms = new MergeSort();
		int[] notes = ms.sort(arr, 0, arr.length - 1);
		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();
		
		CountTheNotes notesCount = new CountTheNotes();
		notesCount.notesCountImplementation(notes, amount);	
	}

}