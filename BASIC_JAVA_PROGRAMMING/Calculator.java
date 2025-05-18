/* Creat Basic Calculator Using Switch Case 
Author :- Chirag Solanki
*/

import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        int no1, no2; 
        char Choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :- ");
        no1 = sc.nextInt();
        System.out.print("Enter Second Number :- ");
        no2 = sc.nextInt();
        System.out.print("Enter The Opration You Want('+','-','*',/) : ");
        Choice = sc.next().charAt(0);
        switch(Choice) {

            case '+' : // Addition
                int sum = no1 + no2;
                System.out.println("Sum Of Two Number = "+sum);
            break;
            case '-' : //Subtraction
                int sub = no1 - no2;
                System.out.println("Subtraction Of Two Number = "+sub);
            break;
            case '*' : //Multiplication
                int mul = no1 * no2;
                System.out.println("Multiplication Of Two Number = "+mul);
            break;
            case '/' : // division
                int div = no1 / no2;
                System.out.println("division Of Two Number = "+div);
            break;
            default :
                System.out.println("Invalid Choice!");
            break;


        }
    }
}