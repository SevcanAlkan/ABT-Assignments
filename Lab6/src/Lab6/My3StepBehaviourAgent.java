package Lab6;

import Lab6.Behaviours.My3StepBehaviour;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class My3StepBehaviourAgent extends Agent {
	
	private static final long serialVersionUID = 1956887464204872341L;

	protected void setup() {
		addBehaviour(new My3StepBehaviour());
		
		addBehaviour(new WakerBehaviour(this, 5000) {
			private static final long serialVersionUID = -5072028319372285401L;

			protected void handleElapsedTimeout() {
				System.out.println("Agent "+myAgent.getLocalName()+": It's wakeup-time. Bye...");
				myAgent.doDelete();
	 		}
		});
	}

}
