package day2assignment;
import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a character");
	     char ch=((sc.nextLine()).charAt(0));
	     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u')
	     {
	    	 System.out.println("vowel");
	     }
	     else if((ch>='a'&&ch<='z')||(ch>='A' && ch<='Z')) {
	    	 System.out.println("consonent"); 
	    }
	     else {
	    	 System.out.println("not an Alphabet"); 
		    
	     }

	}

}
