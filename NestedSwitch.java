package LabWeek1;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=2;
		switch(a) {
		case 1:System.out.println("Start");
		       break;
		case 2:switch(b) {
		        case 1: System.out.println("Java");
		                break; 
		        case 2:  System.out.println("NodeJs");
                         break;         
		         }
		}

	}

}
