/* Program to check the given number is Odd or Even
Author :- Chirag Solanki */
import java.util.Scanner;
public class OddOrEven{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number :- ");
        no = sc.nextInt();
        if(no % 2 == 0){
            System.out.println("Given Number "+no+" Is Even!");
        }else{
            System.out.println("Given Number "+no+" Is Odd!");
        }
    }
}