package basic.oopsv5;

public class Chase implements FundsTransfer{

	@Override
	public void doTransfer(String srcAccount, String destAccount, int amount) {
			System.out.println(" Chase "+srcAccount+ " , "+destAccount+" "+amount);
		
	}
	
	

}
