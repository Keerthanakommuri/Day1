package day2assignment;

import java.util.Scanner;

public class SeatAllocation2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,column,roll;
		System.out.println("enter no. of rows:");
		 row=sc.nextInt();
		 System.out.println("enter no. of columns:");
		 column=sc.nextInt();
		 System.out.println("enter the roll number of the student:");
		 roll=sc.nextInt();
		 if(roll %row==0||roll%row==1||roll<=row) {
			 System.out.println("yes");
		 }
			 else {
				 System.out.println("no");
			 }
	}
}

	
