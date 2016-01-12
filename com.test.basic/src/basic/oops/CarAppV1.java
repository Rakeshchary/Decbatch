package basic.oops;

public class CarAppV1 {

	public static void main(String[] args) {
		
		Honda honda = new Honda();
		execute(honda);
		
		Nissan nissan = new Nissan();
		execute(nissan);
		
	}
	
	public static void execute(Nissan nissan){
		nissan.Start();
		nissan.Move();
		nissan.Stop();
		
	}
	
	public static void execute(Honda honda){
		honda.Start();
		honda.Move();
		honda.Stop();

}
}
