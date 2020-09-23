package Day4;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		String string="";
		int i,j;
		boolean status=true;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String : ");
		string=input.next();
		input.close();
		i=0;
		j=string.length()-1;
		while(i<j)
		{
			if(string.charAt(i)!=string.charAt(j))
				status=false;
			i++;
			j--;
		}
		if(status)
			System.out.println("Is Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
