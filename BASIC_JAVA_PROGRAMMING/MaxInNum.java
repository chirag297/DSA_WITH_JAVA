/*Program to find Maximum in two Number
Author :- Chirag Solanki*/

import java.util.Scanner;

public class MaxInNum{
    public static void main(String args[]){
        int no1,no2;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter First Number :-");
        no1 = sc.nextInt();
        System.out.print("Enter Second Number :-");
        no2 = sc.nextInt();
        sc.nextLine();

        if(no1 > no2) //conditional part
        {
            System.out.println("First Number "+no1+" is Maximum!");
        }else{
            System.out.println("Second Number "+no2+" is Maximum!");
        }
    }
}
// This is the easiest Program Of Conditinal Statement Chapter