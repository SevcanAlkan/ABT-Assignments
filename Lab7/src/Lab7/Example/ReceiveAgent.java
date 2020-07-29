package Lab7.Example;
import jade.core.Agent;


public class ReceiveAgent extends Agent{

	private static final long serialVersionUID = -7757883448654484897L;

	protected void setup() {
		addBehaviour(new ReceiveAgentBehaviour(this));
	}

}
