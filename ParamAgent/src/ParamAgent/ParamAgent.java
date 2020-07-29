package ParamAgent;

import jade.core.Agent;

public class ParamAgent extends Agent {

	private static final long serialVersionUID = 1L;

	protected void setup() {
		Object[] args = getArguments();
		String s;
		
		if(args != null) {
			for (int i = 0; i < args.length; i++) {
				s = (String) args[i];
				
				System.out.println("p" + i + ": " + s);
				
			}
			
			int firstNumber = Integer.parseInt((String) args[0]);
			int secondNumber = Integer.parseInt((String) args[1]);
			
			int totalValue = Math.addExact(firstNumber, secondNumber);
			int smallerNumber = Math.min(firstNumber, secondNumber);
			int biggerNumber = Math.max(firstNumber, secondNumber);
			int totalValueOfAllNumbers = 0;
			
			for (int i = smallerNumber + 1; i < biggerNumber; i++) { 
				totalValueOfAllNumbers = totalValueOfAllNumbers + i;
			}
			
			System.out.println("Sum of two inputs: " + totalValue);
			System.out.println("Bigger number: " + biggerNumber);
			System.out.println("Calculation result of all numbers between the two input number: " + totalValueOfAllNumbers);
		}
		
	}
}
