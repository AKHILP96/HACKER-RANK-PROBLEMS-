package ctci;

import java.util.Scanner;

public class palipermu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = input.nextLine();
		System.out.println("to");
		String s2 = s1.toLowerCase();
		s2 = s2.replace("\\s", "");
		char[] s3 = s2.toCharArray();
		int[] finalArr = new int[128];
		for(int i=0;i<128;i++){
			finalArr[i]=0;
		}
		for(int i=0;i<s3.length;i++){
			int temp = (int)s3[i];
			finalArr[temp]++;
		}

		int odd = 0;
		for(int i=0;i<finalArr.length;i++){
			if(finalArr[i]%2!=0){
					odd++;
					}
				}
		if(odd>1){
			System.out.println("nope");
		}else{
			System.out.println("yep");
		}

	}

}
