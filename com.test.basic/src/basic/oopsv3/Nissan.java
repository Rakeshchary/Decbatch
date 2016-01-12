package basic.oopsv3;

public class Nissan implements Car{
	
	
	public void Stop(){
		System.out.println("****** Stop *******");
	}
	
	public void Move(){
		System.out.println("****** Move *******");
	}
		
		
	@Override
	public void Start() {
		System.out.println("********** Nissan Start ***********");
	}

	
	

}
