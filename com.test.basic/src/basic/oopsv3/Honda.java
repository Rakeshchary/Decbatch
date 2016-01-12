package basic.oopsv3;

public class Honda implements  Car{

	@Override
	public void Move() {
      System.out.println("********* Honda Move ***********");

	}
	
	public void Stop(){
		System.out.println("****** Stop *******");
	}
	
	@Override
	public String toString() {
		return "Honda";
		
	}
	@Override
	public void Start() {
		System.out.println("********** Honda Start ***********");
	}

	}

	

