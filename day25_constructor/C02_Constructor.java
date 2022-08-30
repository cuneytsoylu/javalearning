package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {


    public static void main(String[] args) {

        C01         obje1         =       new           C01()       ;
 //  class adi    objenin adi           keyword       constructor

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
        //List<String> list2=new List<>();
/*
Javada bir obje
 */
        System.out.println(obje1.sayi);// 0

        obje1.deneme();// C01 den deneme method calisir







    }
}
