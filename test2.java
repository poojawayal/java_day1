import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1");
		no1 = sc.nextInt();
		System.out.println("Enter No2");
		no2 = sc.nextInt();
		sc.close();
		result = no1 + no2 ;
		System.out.println("Addition:"+result);

	};

}
