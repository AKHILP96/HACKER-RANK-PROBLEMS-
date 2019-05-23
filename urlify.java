package ctci;

import java.util.Scanner;

public class urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1 = input.nextLine(); 
	    s1 = s1.trim(); 
	    s1 = s1.replaceAll(" ", "%20");  
	    System.out.println(s1); 
	    
	}

}
