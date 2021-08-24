package day3assignment;
import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i=1,j,sum=0,count=0,count1=0;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		while(i<=n) {
			System.out.println("enter the number");
			j=sc.nextInt();
			i++;
			if(j>0) {
				count++;
			}
				else {
					count1++;
			}
		}
		System.out.println(" the number of positive numbers are "+count+" and the number of negative numbers are "+count1+"");
		

	}

}
