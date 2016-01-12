package basic.oopsv4;

public class Honda extends  Car{

	@Override
	public void Move() {
      System.out.println("********* Honda Move ***********");

	}
	
	public void Stop(){
		System.out.println("****** Honda Stop *******");
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

	

