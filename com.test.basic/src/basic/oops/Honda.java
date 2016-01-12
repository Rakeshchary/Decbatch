package basic.oops;

public class Honda extends Car{

	@Override
	public void Move() {
      System.out.println("********* Honda Move ***********");

	}
	
	public void moonroof(){
		System.out.println("****** Moon Roof *******");
	}
	
	@Override
	public String toString() {
		return "Honda";
	
	
	}
}
