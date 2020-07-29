package Lab5.Behaviours;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class My3StepBehaviour extends OneShotBehaviour {
	
	private static final long serialVersionUID = -4079509656897079255L;
	private int state = 1;
	
	public My3StepBehaviour(Agent agent)
	{
		super(agent);
	}
	
	 public void action() {
		 switch (state) {
			 case 1: { System.out.println(state); state++; return; }
			 case 2: { System.out.println(state); state++; return; }
			 case 3: { 
				 System.out.println(state); state=1;
				 return; 
 			}
		 }
	 }	 
}
