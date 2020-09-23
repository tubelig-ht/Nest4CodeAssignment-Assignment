package Nest4CodeAssignment;

import java.util.Scanner;

public class Day3Assignment3 {
	public static void main(String[] args) {
		int year=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Date : ");
		year=input.nextInt();
		input.close();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Date in Leap Year");
				}
				else {
					System.out.println("Date Not in Leap Year");
				}
			}
			else
			{
				System.out.println("Date in Leap year");
			}
		}
		else
			System.out.println("Date Not in Leap Year");
		
	}
}
