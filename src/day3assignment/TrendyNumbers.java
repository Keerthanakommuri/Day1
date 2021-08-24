package day3assignment;
import java.util.Scanner;

public class TrendyNumbers {

	public static void main(String[] args) {
		int mid,n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		mid=(n/10)%10;
		while(n!=0) {
			n=n/10;
			count++;
		}
			if(mid%3==0&& count==3) {
				System.out.println("trendy number");
			}
				else {
					System.out.println("not a trendy number");
				}
	}
}
	

		
		
		
				
				


