package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		
		double winChance = 0.5;
		
		double winLimit = startAmount * 2;
		
		System.out.println("How many days do you want to play?");
		int totalSimulations = in.nextInt();
		
		for (int simulations = 0; simulations < totalSimulations; simulations++) {
		while (startAmount < winLimit && startAmount > 0) {
			double chance = Math.random();
			if (winChance > chance) {
				startAmount++;
			}
			else {
				startAmount--;
			}
		}
		}	
			
			
		
		if (startAmount >= winLimit) {
			System.out.println("Success!");
		}
		else {
			System.out.println("Ruin");
		}

	}
	
}
