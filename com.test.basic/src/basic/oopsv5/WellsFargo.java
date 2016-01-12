package basic.oopsv5;

public class WellsFargo implements FundsTransfer{
    
	@Override
	public void doTransfer(String srcAccount, String destAccount, int amount) {
	System.out.println("Wellsfargo " + srcAccount + " , " + destAccount + " , "+amount);
		
	}

	
	
}
