package Nest4CodeAssignment;

import java.util.Scanner;

public class Day3Assignment2 {
	public static void main(String[] args) {
		String s1,s2;
		String newS1,newS2;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		s1=input.next();
		System.out.print("Enter String 2 : ");
		s2=input.next();
		newS1=s2.substring(s2.length()-2,s2.length())+s1.substring(2,s1.length()-2)+s2.substring(0, 2);
		newS2=s1.substring(s1.length()-2,s1.length())+s2.substring(2,s2.length()-2)+s1.substring(0, 2);
		System.out.println(newS1);
		System.out.println(newS2);
		input.close();
		
	}

}
