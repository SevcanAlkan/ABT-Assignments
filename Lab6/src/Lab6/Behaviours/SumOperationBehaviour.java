package Lab6.Behaviours;

import jade.core.behaviours.SimpleBehaviour;

public class SumOperationBehaviour extends SimpleBehaviour {

	private static final long serialVersionUID = -8185349087609705027L;
	private boolean finished = false;	
	private int firstNumber;
	private int secondNumber;
	private char operationType;
	
	public SumOperationBehaviour(int firstNumber, int secondNumber, char operationType) {
		super();	
		
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operationType = operationType;
	}

	@Override
	public void action() {
		if(firstNumber == 0 && secondNumber == 0) {
			System.out.println("Both input are incorrect!");
			return;
		}
		
		int calculationResult = 0;
		
		try {
			switch(operationType) {
				case '*':  
					calculationResult = firstNumber * secondNumber; 
				break;
				case '+': 
					calculationResult = firstNumber + secondNumber;
				break;
				case '-': 
					calculationResult = firstNumber - secondNumber;
				break;
				case '/': 
					calculationResult = firstNumber / secondNumber;
				break;
			}
			
			System.out.println(firstNumber + " " + operationType + " " + secondNumber + " = " + calculationResult);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			finished = true;
		}
	}

	@Override
	public boolean done() {
		return finished;
	}
}
