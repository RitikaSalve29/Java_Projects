package BankSystem_Inheritance;

public class MMBankFactory extends BankFactory {

	@Override
	public MMSavingAcc getNewSavingAcc(int AccNo, String accName, float accBal, boolean isSalaried ) {
		// TODO Auto-generated method stub
		return new MMSavingAcc(AccNo, accName, accBal, isSalaried);
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int AccNo, String accName, float accBal, float CreditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAcc(AccNo, accName,accBal,CreditLimit);
	}

}
