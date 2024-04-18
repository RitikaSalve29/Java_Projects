package BankSystem_Inheritance;

import Interface_Exmp.Account;

public abstract class BankAcc {

	private int AccNO;
	private String AccName;
	private float AccBalance;
	
	public int getAccNO() {
		return AccNO;
	}
	
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public float getAccBalance() {
		return AccBalance;
	}
	
	public BankAcc(int accNO, String accName, float accBalance) {
		AccNO = accNO;
		AccName = accName;
		AccBalance = accBalance;
	}
	
	 public void deposit(float amount) {
		 this.AccBalance += amount;
	    }

	public abstract void withdraw(float amount);
	
	@Override
	public String toString() {
		return "BankAcc [AccNO=" + AccNO + ", AccName=" + AccName + ", AccBalance=" + AccBalance + "]";
	}
	
	
	
}
