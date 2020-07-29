package Lab4;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.ControllerException;

public class Task3Agent extends Agent {
	
	private static final long serialVersionUID = -7720184142012649707L;

	protected void setup() {
		ContainerController c = getContainerController();
		try {
			AgentController mainAgent = c.getAgent("MainAgent");
			mainAgent.suspend();
				
			Object[] args = getArguments();
			int number = 0;
			
			if(args != null) {
				number = (int) args[0];
				
				if((number % 1) == 0) { //Even
					System.out.println("Number is even: " + number);
				} else { //Odd
					System.out.println("Number is odd: " + number);
				}
			}
		
			mainAgent.activate();
		
		} catch (ControllerException e) {
			e.printStackTrace();
		}
		
		this.doDelete();
	}
}