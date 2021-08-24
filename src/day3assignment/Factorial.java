package day3assignment;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact,n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		i=sc.nextInt();
		for(int i=1;i<n;i++) {
			fact=fact*i;
			if(n==fact) {
				fact=1;
				break;
			}
		}
		if(fact==1) {
			System.out.println("factorial");
		}
			else {
				System.out.println("not a factrial");
		}

	}

}
