package day3assignment;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int n,a,i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
          n=sc.nextInt();
          while(i<=n) {
        		System.out.println("enter the number");
        		a=sc.nextInt();
        		sum=sum+a;
        		i++;
        		System.out.println("the sum is " +sum);
          }
	}

}
