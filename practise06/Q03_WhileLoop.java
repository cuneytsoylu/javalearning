package practise06;

import java.util.Scanner;

public class Q03_WhileLoop {
    public static void main(String[] args) {

/*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise)
   */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");


        int sayi=scan.nextInt();

        int count=0;
        while (sayi>0) {
            if (sayi%2==1) {
                System.out.println(sayi);
                count++;
            }
            sayi--;
        }

        System.out.println("count = " + count);


    }
}
