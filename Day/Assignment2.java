package Nest4CodeAssignment;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		int feet=0,inch=0,kg=0;
		float height,weight;
		Scanner obj=new Scanner(System.in);
		System.out.print("Feet : ");
		feet=obj.nextInt();
		System.out.print("Inch : ");
		inch=obj.nextInt();
		System.out.print("Kg : ");
		kg=obj.nextInt();
		height=feet*30.48f+inch*2.54f;
		weight=(float)(kg*2.2);
		System.out.println("Height in cm : "+height);
		System.out.println("Weight in pounds : "+weight);
	}

}
