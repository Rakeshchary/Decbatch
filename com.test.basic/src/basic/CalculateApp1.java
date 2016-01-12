package basic;

public class CalculateApp1 {

	public static void main(String[] args) {
	     add(5,6);
		 add(12,14);
		 add(16,15);
	
	
		 int result = sub(25,12) + sub(15,26);
		 
		    System.out.println("Result" +result);
		    
	}
		
		public static void add( int x ,int y){
			int c2 = x + y;
			System.out.println("Result" +c2);
	
		}
		
		public static int  sub(int x1,int y1){
			int c3 = x1 - y1;
			return c3;
	
		}
		

	}


