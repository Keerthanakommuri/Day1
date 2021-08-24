package day1assignment;
import java.util.Scanner;

public class AverageCalculation {

	public static void main(String[] args) {
		float num1,num2,num3,num4,num5;
		System.out.println("enter the 5 numbers");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		num3=sc.nextFloat();
		num4=sc.nextFloat();
		num5=sc.nextFloat();
		System.out.println("Average of 5 numbers is:"+(num1+num2+num3+num4+num5/5));
		
		}

}
