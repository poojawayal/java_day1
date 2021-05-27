import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num");
		a= sc.nextInt();
		System.out.println("Enter Second num");
		b=sc.nextInt();
		sc.close();
		System.out.println("After swapping");
		temp = a;
		a=b;
		b=temp;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		
		
		

	}

}
