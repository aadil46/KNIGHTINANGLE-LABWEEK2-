package LabWeek1;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		int  b=a; 
		System.out.println("Automatic conversion"+b);
		
		int c=10;
		int d=10;
		
		byte sum=(byte)c;//type casting makes it possible to store compatible types
		//byte sum=c;
		System.out.println("Error"+sum);
		
		float g=102.20f;
		
		d=(int)g;
		//d=g;
		System.out.println("Error"+d);
		
		byte m=10;
		byte n=20;
		
		/*byte sum1=m*n;
		
		System.out.println("error1"+)
		*/
		
		

	}

}
