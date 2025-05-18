/* Program to check the given number is Prime or not
Author :- Chirag Solanki */

import java.util.Scanner;

public class Prime{
    public static void main(String args[]) {
        int no, count=2;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :- ");
        no = sc.nextInt();
        while(count < no){
            if(no % count == 0){
                flag = false;
            }
            count++;
        }
        if(flag){
            System.out.println("Given Number "+no+" Is Prime");
        }else{
            System.out.println("Given Number "+no+" Is Not Prime");
        }
    }
    
}