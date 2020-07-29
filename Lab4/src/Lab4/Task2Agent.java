package Lab4;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.ControllerException;

public class Task2Agent extends Agent {
	
	private static final long serialVersionUID = 4284002876472873118L;

	protected void setup() {
		ContainerController c = getContainerController();
		try {
			AgentController mainAgent = c.getAgent("MainAgent");
			mainAgent.suspend();
			
			Object[] args = getArguments();
			int sumTotal = 0;
			
			if(args != null) {
				for (int i = 0; i < args.length; i++) {
					sumTotal = sumTotal + (int) args[i];				
				}
				
				System.out.println("Total value of the numbers: " + sumTotal);
			}
			
			mainAgent.activate();
			
		} catch (ControllerException e) {
			e.printStackTrace();
		}
		
		this.doDelete();
	}
}
