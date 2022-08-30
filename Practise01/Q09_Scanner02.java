package Practise01;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen memleketinizi  giriniz");
        String memleket=scan.nextLine();
        System.out.println("lutfen su an bulundugunuz konumu yaziniz");
        String konum=scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();
        System.out.println("yasadiginiz "+konum+" yı seviyor musunuz?");
        boolean yer=scan.nextBoolean();

        System.out.println("yer = " + yer);
        System.out.println("boy = " + boy);
        System.out.println("yas = " + yas);
        System.out.println("konum = " + konum);
        System.out.println("memleket = " + memleket);
        System.out.println("isim = " + isim);


        System.out.println("isminiz : "+isim+"\nmemleketiniz : "+memleket+"\nsu anki konumunuz : "
                +konum+"\nyasiniz : "+yas+"\nboyunuz: "+boy+"\nyasadıgınız yeri seviyor musunuz? :"+yer);









    }
}
