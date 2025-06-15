/* Program to Print Fibonacci Series 
Author:- Chirag Solanki 
*/

public class Fibonacci{
    public static void main(String args[]){
        int no=5, first = 0 , second = 1,fib=0;
        System.out.print(first+" "+second);
        while(no>0){
            fib= first + second;
            first=second;
            second=fib;
            System.out.print(" "+fib);
            no--;
        }
        

    }
}