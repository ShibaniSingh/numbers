/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the character:");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        
        if((c>='a' && c<='z')||(c>='A'&& c<='Z'))
        {
            System.out.println(c+" is an alphabet");  
        }
        else
        {
            System.out.println(c+" is not an alphabet");
        }
    }
}
