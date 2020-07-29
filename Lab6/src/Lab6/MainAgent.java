package Lab6;

import java.util.Scanner;

import Lab6.Behaviours.SumOperationBehaviour;
import jade.core.Agent;

public class MainAgent extends Agent {

	private static final long serialVersionUID = 3491784279430838041L;
	private Scanner sc = new Scanner(System.in);
	
	protected void setup() {
		
		int firstNumber = getIntInput("Please enter first number:");		
		int secondNumber = getIntInput("Please enter second number:");
		char operationType = getCharInput("Please enter the operation type(+,*,-,/):");
		
		addBehaviour(new SumOperationBehaviour(firstNumber,secondNumber, operationType));
	}
	
	private int getIntInput(String message) {
		System.out.print(message);
		while(!sc.hasNextInt()) {
			System.out.println("You entred non-numeric value!");
			System.out.print(message);					
		}

		return sc.nextInt();
	}
	
	private char getCharInput(String message) {		
		char input = '\u0000';
		boolean isFirstTime = true;
		
		while(input != '*' && input != '/' && input != '-' && input != '+') {
			if(!isFirstTime) {
				System.out.println("The value wanst correct!");
			}
			
			input = getStringInput(message).charAt(0);
			
			isFirstTime = false;
		}

		return input;
	}
	
	private String getStringInput(String message) {
		System.out.print(message);
		
		while(!sc.hasNext()) {
			System.out.println("You entred incorrect value!");
			System.out.print(message);	
			sc.next();
		}
		
		return sc.next();
	}
}
