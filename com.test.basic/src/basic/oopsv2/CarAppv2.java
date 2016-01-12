package basic.oopsv2;

public class CarAppv2 {

	public static void main(String[] args) {
		
		Honda honda = new Honda();
		execute(honda);
		
		Nissan nissan = new Nissan();
		execute(nissan);
		
	}
	
	public static void execute(Car car){
		car.execute();
		if(car instanceof Nissan){
		Nissan nissan = (Nissan) car;
		nissan.boseaudio(); 
		}else if (car instanceof Honda){
			Honda honda = (Honda) car;
			honda.moonroof();
		}
		
	}
}
