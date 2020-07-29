package Lab3;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class CreateNewAgent extends Agent {
	protected void setup() {
		System.out.println("My lacal name is " + getLocalName());
		System.out.println("Hello world! My name is " + getAID());
		
		String name = "Tom";
		ContainerController c = getContainerController();
		
		try {
			AgentController a = c.createNewAgent(name, "Lab3.SecondAgent", null);
			a.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
