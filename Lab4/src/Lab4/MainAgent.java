package Lab4;

import java.util.Scanner;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainAgent extends Agent {
	
	private static final long serialVersionUID = 1L;
	private Scanner sc = new Scanner(System.in);
	
	protected void setup() {
		System.out.println("Lab4 - MainAgent is working!");
		
		runFirstTask();
		
		runSecondTask();
		
		runThirdTask();
	}

	private void runFirstTask() {
		System.out.println("Lab4 - Task 1");
		
		int monthNumber = getIntInput("Please enter number of month:");
		startNewAgent("Lab4T1", "Lab4.Task1Agent",
					new Object[] {monthNumber});
	}

	private void runSecondTask() {
		System.out.println("Lab4 - Task 2");
		
		int firstNumber = getIntInput("Please enter first number:");		
		int secondNumber = getIntInput("Please enter second number:");
		
		startNewAgent("Lab4T2", "Lab4.Task2Agent",
				new Object[] {firstNumber, secondNumber});
	}
	
	private void runThirdTask() {
		System.out.println("Lab4 - Task 3");
		
		int number = getIntInput("Please enter a number:");
		
		startNewAgent("Lab4T3", "Lab4.Task3Agent",
				new Object[] {number});
	}
	
	// Helper methods ------------------------------------------------------------
	
	private int getIntInput(String message) {
		System.out.print(message);
		while(!sc.hasNextInt()) {
			System.out.println("You entred non-numeric value!");
			System.out.print(message);					
		}

		return sc.nextInt();
	}
	
	private void startNewAgent(String name, String path, Object[] args) {		
		try {
			
			if(name == null || name.length() == 0 || path == null || path.length() == 0) {
				return;
			}
			
			String Name = new String(name);
			String Path = new String(path);
			Object[] Params;
			
			if(args != null) {
				Params = new Object[args.length];
				for (int i = 0; i < args.length; i++) {
					Params[i] = args[i];
				}
			} else {
				Params = null;
			}
			
			ContainerController c = getContainerController();
			AgentController agent = c.createNewAgent(Name, Path, Params);
			agent.start();		
			
			//while(c.getAgent(Name) != null) {
				//this.wait(2000L);
			//}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
