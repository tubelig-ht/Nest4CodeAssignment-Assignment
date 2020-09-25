package Day5;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String args[])  
	{    
	 int num1=0,num2=1,num3,i,tot=0;    
	 Scanner input=new Scanner(System.in);
	 System.out.print("Enter : ");
	 tot=input.nextInt();
	 input.close();
	 System.out.print(num1+" "+num2);
	 for(i=2;i<tot;++i)
	 {    
	  num3=num1+num2;    
	  System.out.print(" "+num3);    
	  num1=num2;    
	  num2=num3;    
	 }    
	 
	}
}
