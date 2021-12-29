package com.greatleaning.lab.algorithm;

import java.util.Scanner;

public class PayMoneyTransactions {
	
	private static int checkForTransactions(int[] elements, int size, int target) {
		int sum = 0, transactions = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + elements[i];
			if (sum >= target) {
				transactions = i + 1;
				break;
			}
		}
		if (sum < target)
			transactions = 0;
		return transactions;
	}
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int size ,targets,target;
		System.out.println("Enter the Size of transaction array");
		size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		targets = scan.nextInt();
		for (int i = 0; i < targets; i++) 
		{
			int count = 0;
			System.out.println("Enter the value of target");
			 target = scan.nextInt();
			 
			if (target > 0) 
			{
				count = checkForTransactions(arr, size, target);
				if (count > 0)
				{
					System.out.println("Target achieved after " + count + " transactions\n");
				}
				else 
				{
					System.out.println("Target not achieved\n");
			    }
			}
			else 
			{
			System.out.println("Target is invalid\n");
		    }
		}
	}
	
	}


