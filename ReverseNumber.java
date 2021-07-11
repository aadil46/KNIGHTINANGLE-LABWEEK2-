package LabWeek1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=251;
		int temp;
		int rev=0;
		while(a>0) {
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
         System.out.println("Reverse Number"+rev);
	}

}
