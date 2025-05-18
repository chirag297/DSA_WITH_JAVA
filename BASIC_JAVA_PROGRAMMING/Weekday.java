/* program to input weeknumber(1-7) and print day of week name using switch case. 
Author :- Chirag Solanki
*/

import java.util.Scanner;

public class Weekday{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Week Number :- ");
        no = sc.nextInt();
        switch(no){
            case 1:
                System.out.print(" Sunday ");
            break;
            case 2:
                System.out.print(" Monday ");
            break;
            case 3:
                System.out.print(" tuesday ");
            break;
            case 4:
                System.out.print(" Wednesday ");
            break;
            case 5:
                System.out.print(" Thursday ");
            break;
            case 6:
                System.out.print(" Friday ");
            break;
            case 7:
                System.out.print(" Saturday ");
            break;
            default:
                System.out.print("Invalid Choice!");
            break;
        }
    }
}