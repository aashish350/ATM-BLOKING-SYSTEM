package atm.project;

import java.util.Scanner;

public class ATM {
	private int accountNum=1111;
	private int password=2222;
	private int accNum;
	private int pass;
	private int amount;
	
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the desired amount...");
		amount=sc.nextInt();
		System.out.println("Please enter the account Number...");
		accNum=sc.nextInt();
		System.out.println("Please enter the password... ");
		pass=sc.nextInt();
		
		
	}
	
	public void verify() throws InvalideUserException {
		if(accountNum==accNum && password==pass) {
			System.out.println("Please take your maney and amount of money is ::"+amount);
		}else {
			throw new InvalideUserException("Invalide Credentials...");
			
		}
	}

}
