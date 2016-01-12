package basic.oopsv1;

public abstract  class Car {

     public void Start(){
    	 
    	 System.out.println("******Start*******");
    	 
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


