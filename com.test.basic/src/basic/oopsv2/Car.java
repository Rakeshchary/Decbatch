package basic.oopsv2;

public abstract class Car {

     public abstract void Start();
     
     public void execute(){
    	 Start();
         Move();
         Stop();
     }
     
     public void Move(){
    	 System.out.println("********** Move **********");
     }

     public void Stop(){
    	 System.out.println("********** Stop **********");
     }

	@Override
	public String toString() {
		return "Car";
		
	}




     

	}


