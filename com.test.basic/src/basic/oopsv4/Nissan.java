package basic.oopsv4;

public class Nissan extends Car{
	
	
	public void Stop(){
		System.out.println("****** Nissan Stop *******");
	}
	
	public void Move(){
		System.out.println("****** Nissan Move *******");
	}
		
		
	@Override
	public void Start() {
		System.out.println("********** Nissan Start ***********");
	}

	
	

}
