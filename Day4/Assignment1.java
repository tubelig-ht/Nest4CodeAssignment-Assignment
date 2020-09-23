package Day4;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		int countp=0,counto=0;
		int temp=0,newn=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number : ");
		newn=input.nextInt();
		while(newn>0)
		{
			temp=newn%10;
			newn=newn/10;
			if(temp%2==0)
				countp++;
			else
				counto++;
		}
		System.out.println("Even : "+countp);
		System.out.println("Odd : "+counto);
		input.close();
	}
}
