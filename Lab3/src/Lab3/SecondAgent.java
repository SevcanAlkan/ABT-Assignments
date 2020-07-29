package Lab3;

import java.util.Scanner;

import jade.core.Agent;

public class SecondAgent extends Agent {

	private static final long serialVersionUID = 1L;

	protected void setup() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lab3 - Second Agent");
		System.out.print("Please enter first number:");
		while(!sc.hasNextInt()) {
			System.out.println("You entred non-numeric value!");
			System.out.print("Please enter first number:");					
		}
		int firstNumber = sc.nextInt();
		
		System.out.print("Please enter second number:");
		while(!sc.hasNextInt()) {
			System.out.println("You entred non-numeric value!");
			System.out.print("Please enter second number:");					
		}
		int secondNumber = sc.nextInt();
		
		int totalValue = Math.addExact(firstNumber, secondNumber);
		//int smallerNumber = Math.min(firstNumber, secondNumber);
		int biggerNumber = Math.max(firstNumber, secondNumber);
		int totalValueOfAllNumbers = 0;
		
		for (int i = 1; i < 50; i++) { 
			totalValueOfAllNumbers++;
		}
		
		System.out.println("Sum of two inputs: " + totalValue);
		System.out.println("Bigger number: " + biggerNumber);
		System.out.println("Sum of all numbers between 1 and" + 
				"50: " + totalValueOfAllNumbers);		
	}
}
