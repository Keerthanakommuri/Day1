package day2assignment;
import java.util.Scanner;

public class MicroWaveOven {

	public static void main(String[] args) {
		int numItems;
		Float heatingtime;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of items:");
        numItems=sc.nextInt();
        System.out.println("enter the single item heating time:");
        heatingtime=sc.nextFloat();
        if(numItems==1) {
        	System.out.println("Heating time:"  + heatingtime);
        }
        	else if(numItems==2) {
        		System.out.println("number of items is more");
        		
        }
	}
}

