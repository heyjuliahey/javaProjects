package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		Email em1 = new Email("George", "Walse");
		
		//em1.setMailboxCapacity(650);
		//em1.setAltEmail("GWalse@gmail.com");
		
		System.out.println(em1.getAltEmail());

		System.out.println(em1.showInfo());
	}
}