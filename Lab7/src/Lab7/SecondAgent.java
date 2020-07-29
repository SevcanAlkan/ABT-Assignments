package Lab7;

import Lab7.Behaviours.MyCalculationBehaviour;
import jade.core.Agent;

public class SecondAgent extends Agent {

	private static final long serialVersionUID = 139764010815421548L;

	protected void setup() {
		addBehaviour(new MyCalculationBehaviour(this));
	}
}
