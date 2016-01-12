package basic;

public class SwithDemo {

	public static void main(String[] args) {
		int day = 5;
		String dayString;
		switch(day){
		case 0:dayString = "Monday";
		break;
		
		case 1:dayString = "Tusday";
		break;
		
		case 2:dayString = "Wedsday";
		break;
		case 3:dayString = "Thursday";
		
		case 4:dayString = "Friday";
		break;
		
		case 5:dayString = "saturday";
		break;
		
		case 6:dayString = "sunday";
		break;
		
		default :dayString = "Invalid Day";
		break;
		}
		
		System.out.println(dayString);

	}

}
