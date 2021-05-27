// import java.math.*;

public class Compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=20000,n=12,r=.06,t=3;
		double amount ;
         
		amount= p * Math.pow(1 + (r / n), n * t)  ;
     //interest = amount - p ;
		System.out.println("Compound amount:"+amount);
//	System.out.println("Compound interest:"+interest);
		
		

	}

}
