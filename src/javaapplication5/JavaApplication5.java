/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Hibaa
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a word");
     Scanner input= new Scanner(System.in);
     String rev="";
     String str=input.next();
     for(int i= str.length()-1; i>=0; i--)
     {
         rev= rev +str.charAt(i);
     }
System.out.println(rev);
    }
}
