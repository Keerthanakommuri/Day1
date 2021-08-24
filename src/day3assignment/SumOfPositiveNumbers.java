package day3assignment;
import java.util.Scanner;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,a,i=1,sum=0,count=0;
	System.out.println("enter the value of n");
	n=sc.nextInt();
	while(i<=n) {
		System.out.println("enter the number");
		a=sc.nextInt();
		i++;
		if(a>=0) {
			count++;
			sum=sum+0;
			
		}
	}
	System.out.println("number of positive numbers entered is "+count+"and the sum is"+sum);
	}

}
