package ctci;

import java.util.Scanner;
import java.util.*;

public class oneway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = input.nextLine();
		System.out.println("Enter String 2");
		String s2 = input.nextLine();
		if(s1.length() == s2.length()){
			flag = compare(s1,s2);
		}else if(s1.length()>s2.length()){
			flag = edit(s1,s2);
		}else if(s1.length()<s2.length()){
			flag = edit(s2,s1);
		}
		System.out.println(flag);
	}

	private static boolean edit(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int index1 = 0;//s1.length();
		int index2 = 0;//s2.length();
		while(index1 < s1.length() && index2 < s2.length()){
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(index1!=index2){
					return false;
				}
				index1++;
			}else{
				index1++;
				index2++;
			}
		}
		return true;
		
	}

	private static boolean compare(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean found = false; 
		for(int i = 0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				if(found){
					return false;
				}
				found = true;
			}
		}
		return found;
	}

}
