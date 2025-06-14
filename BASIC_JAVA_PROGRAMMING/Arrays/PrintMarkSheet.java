/* Program to Student Print MarkSheet 
Author :- Chirag Solanki */

import java.util.*;

public class PrintMarkSheet{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int j;
    int roll[] = new int[2];
    String name[] = new String[2];
    int marks[] = new int[2];
    int total[] = new int[2];
    float per[] = new float[2];

    for(int i=0;i<roll.length;i++){

        System.out.print("Enter Student Roll Number: ");
        roll[i]=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name[i]=sc.nextLine();

       total[i] = 0;


        for(j=0;j<marks.length;j++){
        System.out.print("Enter Subject Mark: ");
        marks[j]=sc.nextInt();
        total[i]+=marks[j];
                   
        }
        per[i] = total[i] / 5.0f;

    }
         


        System.out.print("Roll Number  Name  Sub-1  Sub-2  Sub-3  Sub-4  Sub-5  Total\n");
        
        for(int i=0;i<roll.length;i++){

        
        System.out.print("\t"+roll[i]+"  "+name[i]+"  "+marks[i]+"  "+marks[i]+"  "+total[i]+"  "+per[i]);

        System.out.println();
        
        }


    }

}


    



