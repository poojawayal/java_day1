import java.util.Scanner;

public class SumOfOddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextInt();
		sc.close();
		for(i=0;i<=n;i++)
		{
			if(i%2!=0)
				sum=sum+i;
		}
//		{
//			if(i%2==0) {
//				sum = sum+i;
//		}
		
      //   System.out.println("Sum of even Numbers:"+sum);	
		System.out.println("Sum of Odd Numbers:"+sum);
		

	}

}
