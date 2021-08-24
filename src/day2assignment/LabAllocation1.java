package day2assignment;
import java.util.Scanner;

public class LabAllocation1 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter x:");
		 x=sc.nextInt();
		  System.out.println("enter y:");
		  y=sc.nextInt();
		 System.out.println("enter z:");
		 z=sc.nextInt();
		 if(x<y && x<z){
		 System.out.println("L1 has the mimimal seating capacity");
		 }
		 else if(y<x && y<z) {
			 System.out.println("L2 has the mimimal seating capacity");
		  }
		 else
		 {
			 System.out.println("L3 has the mimimal seating capacity"); 
		 }
	}

}
