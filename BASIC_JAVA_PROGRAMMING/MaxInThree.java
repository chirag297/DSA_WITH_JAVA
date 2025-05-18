/*Program to Find Maximum In Three Number
Author :- Chirag Solanki*/
import java.util.Scanner;

public class MaxInThree{
    public static void main(String args[]){
        int no1,no2,no3;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter First Number :-");
        no1 = sc.nextInt();
        System.out.print("Enter Second Number :-");
        no2 = sc.nextInt();
        System.out.print("Enter Third Number :-");
        no3 = sc.nextInt();

        if(no1 > no2 && no1 > no3) //conditional part
        {
            System.out.println("First Number "+no1+" is Maximum!");
        }else if(no2 > no1 && no2 > no3){
            System.out.println("Second Number "+no2+" is Maximum!");
        }else{
            System.out.println("Third Number "+no3+" is Maximum!");
        }
    }
}