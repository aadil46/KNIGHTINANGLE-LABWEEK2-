package LabWeek1;
import java.util.Scanner;
public class GreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if((a>=b)&&(a>=c)) {
        	System.out.println("Greater Number :"+a);
        }
        else if((b>=a)&&(b>=c)) {
        	System.out.println("Greater Number :"+b);
        }
        else {
        	System.out.println("Greater Number :"+c);
        	
        }
	}

}
