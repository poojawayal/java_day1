import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 number");
		no1=sc.nextInt();
		no2=sc.nextInt();
		no3=sc.nextInt();
		if(no1>no2) {
			if(no1>no3) {System.out.println("no1 is greater");}
		}
		else if (no2>no1) {
			if(no2>no3) {System.out.println("no2 is grater");}
			
		}
		else if(no3>no1) {
			if(no3>no2) {System.out.println("no3 is greater");}
		}
		sc.close();
	}

}
