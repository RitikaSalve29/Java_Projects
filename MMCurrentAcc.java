package BankSystem_Inheritance;

public class MMCurrentAcc extends CurrentAcc{
   

	public MMCurrentAcc(int accNO, String accName, float accBalance, float CreditLimit) {
		super(accNO, accName, accBalance, CreditLimit);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	
	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		 if (amount<= getAccBalance()+getCreditLimit()){
			 super.withdraw(amount);
	            System.out.println("withdraw amount from Current Account is: " + amount);
	        } 
		 else {
	            System.out.println("Withdrawal denied. Insufficient balance.");
	        }
		
	}

}
