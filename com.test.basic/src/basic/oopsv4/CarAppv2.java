package basic.oopsv4;

public class CarAppv2 {

	public static void main(String[] args) {
		
		Honda honda = new Honda();
		execute(honda);
		
		Nissan nissan = new Nissan();
		execute(nissan);
		
	}
	
	public static void execute(Car car){
	  car.Start();
	  car.Move();
	  car.Stop();
	}
}
