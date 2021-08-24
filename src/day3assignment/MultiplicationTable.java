package day3assignment;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m");
		int m=sc.nextInt();
		System.out.println("enter n");
		int n=sc.nextInt();
		int i=1;
		System.out.println("the multiplication of "+n+"table is");
		while(i<=n) {
			System.out.println(m+"*"+i+"="+m*i);
			i++;
		}
    }
	
}
