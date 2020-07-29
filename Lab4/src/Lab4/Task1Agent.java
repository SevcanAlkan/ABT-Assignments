package Lab4;

import java.time.YearMonth;
import java.util.Calendar;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.ControllerException;

public class Task1Agent extends Agent {
	private static final long serialVersionUID = 2085838038228712160L;

	protected void setup() {
		ContainerController c = getContainerController();
		try {
			AgentController mainAgent = c.getAgent("MainAgent");
			mainAgent.suspend();
			
			Object[] args = getArguments();
			int monthNumber = 0;
			
			if(args != null) {
				for (int i = 0; i < args.length; i++) {
					monthNumber = (int) args[i];
					
					System.out.println("Month number is: " + monthNumber);
					
				}
				
				YearMonth yearMonthObject = YearMonth.of(Calendar.getInstance().get(Calendar.YEAR), monthNumber);
				int daysInMonth = yearMonthObject.lengthOfMonth();
				
				System.out.println("Days in month(" + monthNumber + ") : " + daysInMonth);
			}
			
			mainAgent.activate();
		
		} catch (ControllerException e) {
			e.printStackTrace();
		}
		
		this.doDelete();
	}
}
