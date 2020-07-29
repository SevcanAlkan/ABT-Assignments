package Lab5;

import Lab5.Behaviours.My3StepBehaviour;
import jade.core.Agent;

public class My3StepBehaviourAgent  extends Agent {

	private static final long serialVersionUID = 4508160479195859216L;

	public My3StepBehaviourAgent()
	{
	}
	
	protected void setup()
	{
		addBehaviour(new My3StepBehaviour(this));
	}
}
