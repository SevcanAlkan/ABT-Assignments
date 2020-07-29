package Lab5;

import Lab5.Behaviours.MyTickerBehaviour;
import jade.core.Agent;

public class MyTickerBehaviourAgent extends Agent {

	private static final long serialVersionUID = 3765455011298157139L;
	
	protected void setup() {
		addBehaviour(new MyTickerBehaviour(this, 1000));
	}
}
