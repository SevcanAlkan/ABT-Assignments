package Lab6.Behaviours;

import jade.core.behaviours.CyclicBehaviour;

public class My3StepBehaviour  extends CyclicBehaviour{

	private static final long serialVersionUID = 2602581987566442190L;
	private int state = 1;
	 
	public My3StepBehaviour() {
		super();
	}
	
	 public void action() {
		 switch (state) {
			 case 1: { System.out.println(state); state++; return; }
			 case 2: { System.out.println(state); state++; return; }
			 case 3: { System.out.println(state); state=1; return; }
		 }
	 }
}