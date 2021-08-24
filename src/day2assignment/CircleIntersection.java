package day2assignment;
import java.util.Scanner;

public class CircleIntersection {

	public static void main(String[] args) {
          int m,n,o,p,q,r;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter m");
          m=sc.nextInt();
          System.out.println("enter n");
          n=sc.nextInt();
          System.out.println("enter o");
          o=sc.nextInt();
          System.out.println("enter p");
          p=sc.nextInt();
          System.out.println("enter q");
          q=sc.nextInt();
          System.out.println("enter r");
          r=sc.nextInt();
          int power=(int)(Math.pow((p-m),2)+Math.pow((n-q),2));
          int dis=(int)Math.sqrt(power);
          int rad=o+r;
          if(dis==rad) {
        	  System.out.println("the circles are tengential");
          }
        if(dis>rad)	{
        	 System.out.println("the circles do not overlap");
        }
        else if(dis<rad) {
        	 System.out.println("the circles overlap");
        }
          }
	
}