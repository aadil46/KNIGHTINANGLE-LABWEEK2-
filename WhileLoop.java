package LabWeek1;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
	   int sum=0;
       System.out.println("Enter any number which is below 10");
       int number=sc.nextInt();
       while(number<=10) {
    	   sum=sum+number;
    	   number++;
       }
       System.out.println("Sum of number :"+sum);
	}

}
