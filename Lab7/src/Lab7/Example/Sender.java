package Lab7.Example;
import java.util.Scanner;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;


public class Sender extends Agent{

	private static final long serialVersionUID = 4041361754120408246L;
	private Scanner scan;

	protected void setup() {
		System.out.println("Write something!");
		scan = new Scanner(System.in);
		String str = scan.nextLine();

		AID r = new AID("Tom", AID.ISLOCALNAME);

		ACLMessage aclMessage = new ACLMessage(ACLMessage.CFP);
		aclMessage.addReceiver(r);
 
		aclMessage.setContent(str);

		this.send(aclMessage);
	
	}

}
