package day1assignment;
import java.util.Scanner;

public class Ternery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int x;;
		 x=sc.nextInt();
		 boolean isEven = x%2 == 0?true:false;
		 if(isEven)
			 System.out.println("even");
		 else
			 System.out.println("odd");
		 
		 
		

	}

}
