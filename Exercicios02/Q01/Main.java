public class Main{
	public static void main(String[] args){
		MailServer server = new MailServer();
		MailClient client1 = new MailClient(server, "c1");
		MailClient client2 = new MailClient(server, "c2");
		MailClient client3 = new MailClient(server, "c3");
		client1.sendMailItem("c2", "Hii", "Hey girrrl");
		client2.printNextMailItem();
	}
}
