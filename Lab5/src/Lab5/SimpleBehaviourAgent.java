package Lab5;

import Lab5.Behaviours.MySimpleBehaviour;
import jade.core.Agent;

public class SimpleBehaviourAgent extends Agent {

	private static final long serialVersionUID = -7671794948611763930L;

	public SimpleBehaviourAgent() {
		
	}
	
	protected void setup()
	{
		addBehaviour(new MySimpleBehaviour(this));
	}
}
