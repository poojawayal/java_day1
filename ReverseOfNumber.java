import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num");
		n=sc.nextInt();
		sc.close();
		while(n>0)
		{
			r=n%10;
			sum =(sum *10)+r;
			n=n/10;
			
		}
		System.out.println("Reverse of Number:"+sum);

	}

}
