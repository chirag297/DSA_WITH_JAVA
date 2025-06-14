/* Program to Student Print MarkSheet 
Author :- Chirag Solanki */

import java.util.*;

public class PrintMarkSheet{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    
    // declaration part
    int roll[] = new int[3];
    String name[] = new String[3];
    int java[] = new int[3];
    int python[] = new int[3];
    int dbms[] = new int[3];
    int total[] = new int[3];
    float per[] = new float[3];

    // getting student value
 
    for(int i=0;i<roll.length;i++){

        System.out.print("Enter Student Roll Number: ");
        roll[i]=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name[i]=sc.nextLine();

        System.out.print("Enter Java Mark: ");
        java[i]=sc.nextInt();

        System.out.print("Enter Python Mark: ");
        python[i]=sc.nextInt();

        System.out.print("Enter DBMS Mark: ");
        dbms[i]=sc.nextInt();


       total[i] = 0;
       total[i] = java[i] + python[i] + dbms[i];
        per[i] = total[i] / 3.0f;
        

    }    

    System.out.print("Roll Number  Name     Java  Python  DBMS  Total  Percentage(%)\n");
        
        for(int i=0;i<roll.length;i++){

        
        System.out.print("\t"+roll[i]+"  "+name[i]+"\t"+java[i]+"\t"+python[i]+"   "+dbms[i]+"     "+total[i]+"   "+per[i]);
        System.out.println();
        
        }
        


    }

}


/* Sample Output:- 

    Enter Student Roll Number: 101
    Enter Student Name: Chirag
    Enter Java Mark: 93
    Enter Python Mark: 90
    Enter DBMS Mark: 92
    Enter Student Roll Number: 102
    Enter Student Name: Jay
    Enter Java Mark: 97 
    Enter Python Mark: 96
    Enter DBMS Mark: 98
    Enter Student Roll Number: 103
    Enter Student Name: Ajay
    Enter Java Mark: 95
    Enter Python Mark: 96
    Enter DBMS Mark: 94
    Roll Number  Name     Java  Python  DBMS  Total  Percentage(%)
            101  Chirag     93      90   92     275   91.666664
            102  Jay        97      96   98     291   97.0
            103  Ajay       95      96   94     285   95.0

*/
