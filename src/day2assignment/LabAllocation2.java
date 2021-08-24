package day2assignment;
import java.util.Scanner;

public class LabAllocation2 {

	public static void main(String[] args) {
		int x,y,z;
		String lab;
		Scanner sc=new Scanner(System.in);
		 x=sc.nextInt();
		  y=sc.nextInt();
		 z=sc.nextInt();
		 lab=sc.next();
		 
         if(lab.equals("L1")){
        	if(y<z) {
        	System.out.println("L2 has the mimimal seating capacity");
        	}
        	else {
        		System.out.println("L3 has the mimimal seating capacity");	
        	}
         }
         else if(lab.equals("L2")) {
   		  if (x<z){
   			 System.out.println("L1 has the mimimal seating capacity");
   		  }
   		 else
   		 {
   			 System.out.println("L3 has the mimimal seating capacity"); 
   		 }
         }
	else if(lab.equals("L3")) {
		if(x<y) {
			 System.out.println("L1 has the mimimal seating capacity");
		}
			 else {
				 System.out.println("L2 has the mimimal seating capacity");
			 }
	}
	}
}


