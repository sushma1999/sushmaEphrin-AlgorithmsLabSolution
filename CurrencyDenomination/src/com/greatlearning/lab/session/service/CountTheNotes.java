package com.greatlearning.lab.session.service;

public class CountTheNotes {
public void notesCountImplementation(int[] notes, int amount) {
		
		if (amount == 0)
			return;
		
		int[] noteCounter = new int[notes.length];
		try {
				
			for(int i = 0; i < notes.length; i++) {
				if(amount == 0) {
					System.out.println();
				}
				
				if(amount >= notes[i]) {  
					noteCounter[i] = amount / notes[i]; 
					amount = amount - noteCounter[i] * notes[i]; 
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			} 
			else {
				System.out.println("Your Payment approach in order to give minimum number of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" +noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException ex) {
			System.out.println(ex + "notes of denomination 0 is invalid");
		}	
	}
}
