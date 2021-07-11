package LabWeek1;
import java.util.Scanner;
public class GivenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=sc.nextInt();
		int c=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				c++;
			}			
		}
		if(c==0) {
			System.out.println("Prime no"+a);
		}
		else {
			System.out.println("Not a Prime no"+a);
		}

	}

}
