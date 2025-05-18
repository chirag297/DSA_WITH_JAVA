/* Print Any Word 10 times That given by user using while loop 
Author :- Chirag Solanki */

import java.util.Scanner;

public class PrintTenTimes{
    public static void main(String[] args){
        int count = 0; // hear count value is 0
        String line;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Word :-");
        line = sc.nextLine();
        while(count < 10){ // util count value less than 10 that cycle Runs and Print the value
            System.out.println(line);
            count ++; // count value increase by one 
        }
    }
}