package Nest4CodeAssignment;

import java.util.Scanner;

public class Assignment1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float total=0;
		int tax=0;
		float finalamt=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Price 1 : ");
		total=obj.nextFloat();
		System.out.print("Price 2 : ");
		total=total+obj.nextFloat();
		System.out.print("Price 3 : ");
		total=total+obj.nextFloat();
		System.out.print("Tax % : ");
		tax=obj.nextInt();
		finalamt=(tax*total)/100;
		//finalamt=finalamt/100;
		System.out.println("Final Amount: "+(finalamt+total));	
	}
}
