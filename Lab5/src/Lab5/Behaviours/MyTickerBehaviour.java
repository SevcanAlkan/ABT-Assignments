package Lab5.Behaviours;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class MyTickerBehaviour extends TickerBehaviour {
	
	private static final long serialVersionUID = 1474229838328078102L;
	
	public MyTickerBehaviour(Agent a, long period) {
		super(a, period);
	}

	protected void onTick() {
		System.out.println("Agent"+myAgent.getLocalName()+":tick="+ getTickCount());
	} 
}
