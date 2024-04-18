package BankSystem_Inheritance;

public class MMSavingAcc extends SavingAcc {
	private float MINBAL=1000;
	
	
	public MMSavingAcc(int accNO, String accName, float accBalance, boolean isSalaried ) {
		super(accNO, accName, accBalance, isSalaried);
		//this.MINBAL = MINBAL;
	}


	public float getMINBAL() {
		return MINBAL;
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}

	
	@Override
	public void withdraw(float amount) {
		
	 if (getAccBalance()- amount >= MINBAL) {
		super.withdraw(amount);
	            System.out.println("withdraw amount from Saving Account is: " + amount);
	       } 
	 else {
	            System.out.println("Withdrawal denied. Insufficient balance.");
	       }
		 
		
	}
}