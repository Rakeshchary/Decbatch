package basic.oopsv5;

public class FundsTransferApp {
	
	public static void main(String args[])throws Exception{
		
		if(args.length == 1){
			Class classObj = Class.forName(args[0]); //Load your class into memory
			Object Obj = classObj.newInstance();
			FundsTransfer fundstransferRef = (FundsTransfer) Obj;//new Citi();//new Chase();//new WellsFargo();
			//B.L
		    fundstransferRef.doTransfer("45632","25634",11250);
		}else
		
		{
		    System.out.println("Invalid params... Which payment gateway would you like to use ");	
		}
		
	
	}

}
