package Day5;

import java.util.Scanner;

public class Asignment2 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int num = input.nextInt();
    input.close();
	num++;
    for (int i = 2; i < num; i++) {
       if(num%i == 0) {
          num++;
          i=2;
       } else {
          continue;
       }
    }
    System.out.println(num);
    }
}
