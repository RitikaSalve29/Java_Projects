package BankSystem_Inheritance;

public class SavingAcc extends BankAcc{
	
	

	public SavingAcc(int accNO, String accName, float accBalance, boolean isSalaried) {
		super(accNO, accName, accBalance);
		this.isSalaried=isSalaried;
		// TODO Auto-generated constructor stub
	}

	private boolean isSalaried;
	private float MINBAL = 1000.0f;
	//private BankAcc bankacc;
	
	
	

	
	public boolean isSalaried() {
		return isSalaried;
	}

	public float getMINBAL() {
		return MINBAL;
	}

	

	@Override
	public void withdraw(float amount) {
		
		 if (getAccBalance() - amount >= MINBAL) {
	           // bankacc.withdraw(amount);
	            System.out.println("withdraw of "+ amount +" succesful.Total balance:"+getAccBalance());
	        } else {
	            System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
	        }
		
		
	}
	

	@Override
	public String toString() {
		return super.toString()+"SavingAcc [isSalaried=" + isSalaried + ", MINBAL=" + MINBAL + "]";
	}
	
	

}
