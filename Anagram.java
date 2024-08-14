package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String input1 = sc.nextLine();
			String input2 = sc.nextLine();
//			int c=0;
//	        for(int i = 0; i< input1.length();i++) {
//				
//				char temp = input1.charAt(i);
//				if(input2.indexOf(temp) < 0){
//					System.out.println("Not an anagram");
//					break;
//				}
//				else {
//					c++;
//				
//			}
//	        sc.close();
//			//System.out.println("Anagram");
//	        if(c==input1.length()) {
//	        	System.out.println("Anagram");
//	        }
//		}
			
			char a[]=input1.toCharArray();
			char b[]=input2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a,b)) {
				System.out.println("Anagram");
			}
			else
				System.out.println("Not a Anagram");

	}
}
