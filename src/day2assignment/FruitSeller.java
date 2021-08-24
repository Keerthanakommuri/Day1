package day2assignment;
import java.util.Scanner;


public class FruitSeller {

	public static void main(String[] args) {
		float x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price of dozen mangoes");
		 x=sc.nextFloat();
		 System.out.println("enter the price at which 1 mango is being sold");
		  y=sc.nextFloat();
		 z=(y*12);
		 if(x==z) {
			 System.out.println("no profit nor loss");
		}
		 else if(x>z) {
			 System.out.printf("Loss:Rs.%.2f\n",+(x-z));
	   }
		 else {
			 System.out.printf("Loss:Rs.%.2f\n",+(x+z));
		 }

	}

}
