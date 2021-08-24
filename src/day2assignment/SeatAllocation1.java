package day2assignment;
import java.util.Scanner;

public class SeatAllocation1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,column,roll;
		System.out.println("enter no. of rows:");
		 row=sc.nextInt();
		 System.out.println("enter no. of columns:");
		 column=sc.nextInt();
		 System.out.println("enter the roll number of the student:");
		 roll=sc.nextInt();
		 if(roll %column==0||roll%column==1||roll<=column) {
			 System.out.println("yes");
		 }
			 else {
				 System.out.println("no");
			 }
		 }
	}


