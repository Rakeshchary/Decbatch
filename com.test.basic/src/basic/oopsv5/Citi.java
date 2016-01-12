package basic.oopsv5;

public class Citi  implements FundsTransfer{

	@Override
	public void doTransfer(String srcAccount, String destAccount, int amount) {
		System.out.println(" Citi "+srcAccount+ " , "+destAccount+" "+amount);
		
	}
	

}
