package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String faculty;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String altEmail;
	private String email;
	private String uniSuffix = "DLCUniversity.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.faculty = setFaculty();
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + faculty + "." + uniSuffix;
	}
	
	private String setFaculty() {
		System.out.println("Faculty Code\n1 for Computer Science\n2 for Management\n3 for Finance\n4 for Artificial Intelligence\n0 for none\nEnter faculty code: ");
		Scanner sc = new Scanner(System.in);
		int facultyInput = sc.nextInt();
		
		if(facultyInput == 1) {return "ComputerScience";}
		else if (facultyInput == 2) {return "Management";}
		else if (facultyInput == 3) {return "Finance";}
		else if (facultyInput == 4) {return "Politics";}
		else {return "";}
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length()); //random number from 0 to length
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return this.mailboxCapacity; }
	public String getAltEmail() { return this.altEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nFaculty Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
}
