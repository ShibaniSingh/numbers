/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestofthreenos;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class GreatestOfThreeNos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a>b)
        {
            System.out.println(a+" is greatest");
        }
        else if(b>c)
        {
            System.out.println(b+" is greatest");
        }
        else
        {
            System.out.println(c+" is greatest");
        }
    }
}
