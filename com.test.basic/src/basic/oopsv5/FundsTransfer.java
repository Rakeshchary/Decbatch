package basic.oopsv5;

public interface FundsTransfer {
	
	WellsFargo fundtransferRef = null;

	void doTransfer(String srcAccount,String destAccount, int amount);
	
}
