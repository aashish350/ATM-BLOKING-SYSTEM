package atm.project;

public class Bank {
public void intiate() {
	ATM atm=new ATM();
	try {
		atm.input();
		atm.verify();
	}catch(InvalideUserException e) {
		System.out.println(e.getMessage());
		System.out.println("You have losed your first chance...");
		
		try {
			atm.input();
			atm.verify();
		} catch (InvalideUserException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			System.out.println("You have lost your second chance also...");
			System.out.println("please enter the credential carefully...");
			try {
				atm.input();
				atm.verify();
			} catch (InvalideUserException e2) {
				// TODO Auto-generated catch block
				System.out.println(e2.getMessage());
				System.out.println("ATM is blocked please wait some 24 hour...");
				
			}
		}
	}
}
}
