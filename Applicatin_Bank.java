package BankSystem_Inheritance;

public class Applicatin_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory Bfactory = new MMBankFactory();
		 SavingAcc savingAccobj = Bfactory.getNewSavingAcc(23345, "Alice Johnson", 10000, false);
		 CurrentAcc currentAccobj = Bfactory.getNewCurrentAcc(987654, "Bob Brown", 20000, 50000.0f);
		 
		 savingAccobj.withdraw(300.0f); // Withdraw from Savings Account
		 System.out.println(savingAccobj.toString());
		
		 System.out.println("---------------------------------------------------------------");
		
 
	     currentAccobj.withdraw(800.0f);
		 System.out.println(currentAccobj.toString());

	     
	}

}
