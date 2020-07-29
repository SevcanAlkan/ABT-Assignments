package Lab7;

import java.util.Scanner;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainAgent extends Agent {

	private static final long serialVersionUID = -2755077806412965651L;
	private Scanner sc = new Scanner(System.in);

	protected void setup() {
		
		try {
			ContainerController c = getContainerController();
			AgentController agent = c.createNewAgent("SecondAgent", "Lab7.SecondAgent", null);
			agent.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		int firstNumber = getIntInput("Please enter first number:");		
		int secondNumber = getIntInput("Please enter second number:");
		String messageBody = String.valueOf(firstNumber) + "," + String.valueOf(secondNumber);
		
		AID r = new AID("SecondAgent", AID.ISLOCALNAME);

		ACLMessage aclMessage = new ACLMessage(ACLMessage.REQUEST);
		aclMessage.addReceiver(r);
 
		aclMessage.setContent(messageBody);

		this.send(aclMessage);
	}
	
	private int getIntInput(String message) {
		System.out.print(message);
		while(!sc.hasNextInt()) {
			System.out.println("You entred non-numeric value!");
			System.out.print(message);		
			sc.next();
		}

		return sc.nextInt();
	}
}
