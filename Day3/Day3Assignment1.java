package Nest4CodeAssignment;

import java.util.Scanner;

/**
 * @author Virendra
 *
 */
public class Day3Assignment1 {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	int sec;
	int day,hour,min,nsec;
	System.out.print("Enter the time in second : ");
	sec=kb.nextInt();
	day=sec/86400;
	hour=(sec%86400)/3600;
	min=((sec%86400)%3600)/60;
	nsec=((sec%86400)%3600)%60;
	System.out.println(day+" Days "+hour+" Hours "+min+" Minutes "+nsec+" Seconds");
	kb.close();
	
}
}
