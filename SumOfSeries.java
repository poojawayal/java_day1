import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n= sc.nextInt();
		sc.close();
		for(i=0;i<=n;i++)
		{
			sum = sum + i;
			
		}
		System.out.println("Sum is :"+sum);
		

	}

}
