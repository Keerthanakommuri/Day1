package day3assignment;
import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f,l,sum,product,num;
	    num=sc.nextInt();
		f=num/10;
		l=num%10;
		sum=f+1;
		product=f*1;
		if(sum+product==num){
			System.out.println("Special number");
		}
			else {
				System.out.println(" not a Special number");
			}
			
		}

	}


