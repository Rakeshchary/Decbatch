package basic.oops;

public class Pen {
	
		String color;
		public void setColor(String color){
			
			if(this.color == null){
				this.color=color;
			}else{
				System.out.println("only you can  update color one time");
			}
			System.out.println("Updated color value.");
			
		}
		public void write(){
			
			System.out.println("writing in" + color);
		}
	      public Pen(){
	    	  System.out.println("pen zero argument constructor....");
	      }
	      public Pen(String color){
	    	  this.color=color;
	    	  System.out.println("parameter constructor");
	}
}   


