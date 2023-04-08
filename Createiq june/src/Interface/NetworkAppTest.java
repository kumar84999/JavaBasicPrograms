package Interface;

public class NetworkAppTest {

	public static void main(String[] args) {
		AirtelNetwork airtel=new AirtelNetwork();
		airtel.callRate();
		airtel.SMSRate();
		airtel.DATARate();
		airtel.dataRate();
		
	
	System.out.println("............");
	JioNetwork jio=new JioNetwork();
	jio.callRate();
	jio.SMSRate();
	jio.dataRate();
	jio.DATARate();
	System.out.println("...........");
	
	
	Mynetworks mynetwork =new Mynetworks();
	mynetwork.callRate();
	mynetwork.SMSRate();
	mynetwork.DATARate();
	mynetwork.dataRate();
	}
	}