package LabWeek1;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum;
		char ch;
		System.out.println("Enter 1 for Addition 2 for Subtraction 3 for Multiplication 4 for division");
		int a=sc.nextInt();
		do {
			System.out.println("Enter two Number");
			int b=sc.nextInt();
			int c=sc.nextInt();
			switch(a) {
				case 1: sum=b+c;
				         System.out.println(sum);
			             break; 
				case 2: sum=b-c;
		                System.out.println(sum);
	                    break;
				case 3: sum=b*c;
                        System.out.println(sum);
                        break;
				case 4: sum=b/c;
                        System.out.println(sum);
                        break;
                default : System.out.println("Wrong value entered");
                           break;
			}
			System.out.println("Do you want to continue Y/N");
			ch=sc.next().charAt(0);
		}while((ch=='Y')||(ch=='y'));
	}

}
