/*Program to Check The Given Number Positive, Negative or Zero!
Author :- Chirag Solanki */

import java.util.Scanner;

public class PositiveOrNegative{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        no = sc.nextInt();
        if(no > 0){
            System.out.println("Given Number is Positive");
        }else if(no < 0){
            System.out.println("Given Number is Negative");
        }else{
            System.out.println("Given Number is Zero");
        }
    }
}