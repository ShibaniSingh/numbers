/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c=='a')||(c=='e')||(c=='o')||(c=='i')||(c=='u'))
        {
            System.out.println("The character is a vowel");
        }
        else
        {
            System.out.println("The character is a consonant");
        }
       
      
        
    }
}
