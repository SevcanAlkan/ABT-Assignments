package Lab7.Behaviours;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class MyCalculationBehaviour extends CyclicBehaviour {
	
	private static final long serialVersionUID = -4511744010316696042L;
	private static final MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.REQUEST);

	public MyCalculationBehaviour(Agent agent) {
		super(agent);
	}
	
	@Override
	public void action() {
		ACLMessage aclMessage = myAgent.receive(mt);
		if (aclMessage != null) {
			System.out.println(myAgent.getLocalName() + ": I received message.\n");

			String str = aclMessage.getContent();
			System.out.println(str);
			
			try {
				String[] numbers = str.split(",");
				
				if(numbers != null && numbers.length == 2) {
					int firstNumber = Integer.parseInt(numbers[0]);
					int secondNumber = Integer.parseInt(numbers[1]);
					
					int totalValue = Math.addExact(firstNumber, secondNumber);
					int biggerNumber = Math.max(firstNumber, secondNumber);
					int totalValueOfAllNumbers = 0;
					
					for (int i = 1; i < 50; i++) { 
						totalValueOfAllNumbers++;
					}
					
					System.out.println("Sum of two inputs: " + totalValue);
					System.out.println("Bigger number: " + biggerNumber);
					System.out.println("Sum of all numbers between 1 and " + 
							"50: " + totalValueOfAllNumbers);		
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			this.block();
		}
	}
}
