package BankSystem_Inheritance;

public class CurrentAcc extends BankAcc{
	
	

	private float CreditLimit = 50000;
	
	
	public float getCreditLimit() {
		return CreditLimit;
	}

	
	
	
	public CurrentAcc(int accNO, String accName, float accBalance,float CreditLimit) {
		super(accNO, accName, accBalance);
		this.CreditLimit=CreditLimit;
		// TODO Auto-generated constructor stub
	}




	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		 if (amount <= getAccBalance()+getCreditLimit()) {
	           // bankacc.withdraw(amount);
	            System.out.println("withdraw of "+ amount +" succesful.current balance:"+getAccBalance());
	        } else {
	            System.out.println("Exceeds withdrawal limit");
	        }
		
	}
	
	@Override
	public String toString() {
		return  super.toString()+"CurrentAcc [CreditLimit=" + CreditLimit ;
	}


}
