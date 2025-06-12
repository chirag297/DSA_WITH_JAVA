/* Program To Enter And Print Mark With in Array. This Is Sample and Basic Program Of Array
Author:- Chirag Solanki
*/
import java.util.*;

public class SampleArray{
    public static void main(String args[]){
        int marks[] = new int[100]; // Define The size Of Array
        Scanner sc = new Scanner(System.in);
        marks[0] =  87; // We Give Value Ma
        marks[1] =  78;
        marks[2] =  67;
        System.out.print("Java :- "+marks[0]+"\nDBMS :- "+marks[1]+"\nHTML :- "+marks[2]);
        
        /*
        Sample Output:- 
        Java :- 87
        DBMS :- 78
        HTML :- 67
        */
    }
}