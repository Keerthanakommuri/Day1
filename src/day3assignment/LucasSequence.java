package day3assignment;
import java.util.Scanner;

public class LucasSequence {

	public static void main(String[] args) {
		int a=0,b=0,c=1,d=0,n,i;
		i=3;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1) {
			System.out.println("0");
		}
			else if(n==2) {
				System.out.println("0,0");
				}
			else if(n==3) {
				System.out.println("0,0,1");
			}
			while(i!=n) {
				d=a+b+c;
				System.out.println(d+" ");
				a=b;
				b=c;
				c=d;
				i++;
			}
		}
				

	}


