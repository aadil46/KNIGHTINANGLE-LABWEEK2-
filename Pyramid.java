package LabWeek1;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=1;i<=5;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println("");
       }
       System.out.println("------Reverse Pyramid-------");
       for(int i=5;i>=1;i--) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println("");
       }
       
       System.out.println("-----Flyod Traingle----");
       int number=1;
       for(int i=1;i<=5;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print(number);
    		   number++;
    	   }
    	   System.out.println("");
       }
     
	}
 
}
