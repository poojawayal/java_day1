import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,r,c=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
		}
		if(temp==c) {
			System.out.println(temp +" Armstrong num");
		}
		else {
			System.out.println(temp + " is not armstrong num");
		}
			
		
		sc.close();
	}

}
