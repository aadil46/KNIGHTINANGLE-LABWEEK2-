package LabWeek1;

public class DPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=2; i<=100; i++) {
			for(int j=i;j>0;j--) {
				if(i%j==0) {
				 c++;	
				}
			     
			}
			if(c==2) {
				System.out.println("Prime no"+i);
			}
			else {
				System.out.println("Not a Prime no"+i);
			}
			c=0;
			
		}

	}

}
