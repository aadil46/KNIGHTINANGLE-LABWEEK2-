package LabWeek1;
import java.util.Scanner;
public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int[] a=new int[5];
       for (int b=0;b<a.length;b++) {
    	   System.out.println("Enter the"+b+"Number");
    	   a[b]=sc.nextInt();
       }
       System.out.println("Displaying Array values");
       for(int b=0;b<a.length;b++) {
        System.out.println(a[b]);  
       }
       
	}

}
