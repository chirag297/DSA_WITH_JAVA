/* Program To Check The Given Year Is Leap Year or Not
Author :- Chirag Solanki */


import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year :-");
        year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)))
        /*Let's break this Condition
        You Can write It one by one
        declare Three Variable a,b,c.
        Boolean a,b,c;
        a = (year % 4) == 0;
        b = year % 100 != 0;
        c = ((year % 100 == 0) && (year % 400 == 0)) ;
        or you can also write it like If(a && (b || c))
        */
        {
            System.out.println("Given Year Is Leap Year");
        }else{
            System.out.println("Given Year Is Not Leap Year");
        }
    }
}