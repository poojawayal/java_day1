import java.util.Scanner;

public class PallindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(n);
int temp=n;
while(n>0) {
	int r=n%10;
	res=(res*10)+r;
	n=n/10;
	
}
if(temp==res) {
	System.out.println("palindrome");
}
else {System.out.println("Number is not pallindrome");}
sc.close();
	}

}
