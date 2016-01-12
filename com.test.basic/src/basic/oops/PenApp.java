package basic.oops;

public class PenApp {

	public static void main(String[] args) {
		Pen penobj = new Pen();
		//penobj.color = "Red";
		penobj.setColor("Red");
		penobj.setColor("Bule");
		penobj.write();
		
		Pen penobj1 = new Pen();
		//penobj1.color = "Green";
		penobj1.write();
		
		Pen penobj2 = new Pen("Yellow");
		penobj2.write();
	}
	  

}
