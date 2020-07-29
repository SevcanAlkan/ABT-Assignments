package Lab7.Example;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;


public class ReceiveAgentBehaviour extends CyclicBehaviour {

	private static final long serialVersionUID = 6882225524535033830L;
	private static final MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.CFP);

	public ReceiveAgentBehaviour(Agent agent) {
		super(agent);
	}

	public void action() {
		ACLMessage aclMessage = myAgent.receive(mt);
		if (aclMessage != null) {
			System.out.println(myAgent.getLocalName() + ": I received message.\n");

			String str = aclMessage.getContent();
			System.out.println(str);
		} else {
			this.block();
		}
	}

}
