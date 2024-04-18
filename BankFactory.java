package BankSystem_Inheritance;

public abstract class BankFactory {
	
	 public abstract SavingAcc getNewSavingAcc (int AccNo, String accName, float accBal, boolean isSalaried );
	 public abstract CurrentAcc getNewCurrentAcc (int AccNo, String accName, float accBal, float CreditLimit );
}
