package practise05;

import java.util.Scanner;

public class Q05_MetCreationForLoop {
    public static void main(String[] args) {

        /* Interview Question
 Write a Java program to reverse a string. Use for loop and create a method called
  reverseString */

        Scanner scan =new Scanner(System.in);
        System.out.println("bir string giriniz");
String str=scan.nextLine();

reverseString(str);

        System.out.println("String in tersi : "+reverseString(str));



    }

    public static String reverseString(String str) {

        String reversed="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);

        }



        return reversed;
    }
}
