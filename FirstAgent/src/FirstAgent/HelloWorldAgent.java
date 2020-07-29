package FirstAgent;

import jade.core.AID;
import jade.core.Agent;

public class HelloWorldAgent extends Agent {
	
	private static final long serialVersionUID = 1L;
	
	protected void setup() {
		System.out.println("Hello World! My name is " + getLocalName());
		
		doDelete();
	}
}
