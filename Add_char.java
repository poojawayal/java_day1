import java.util.Scanner;

public class Add_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char a,b;
		 int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		  a = sc.next().charAt(0);
		System.out.println("enter b:");
		b = sc.next().charAt(0);
		result = a+b;
	
		System.out.println("Addition:"+result);
		
		
		sc.close();

		

	}

}
