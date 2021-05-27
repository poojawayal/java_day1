import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,no=1,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		no = sc.nextInt();
		while(i<=no)
		{
			fact = fact * i;
			i++;
		
		}
		System.out.println("Factorial of"+ no +" is:"+fact);
		
		sc.close();
	}

}
