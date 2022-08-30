package Practise13_interwiewQestions;

public class Q02 {
    /*
        // Stringi ters cevirmek icin bir Java Programi yazin
        //1.Yol: StringBuilder () kullanarak
        //2.Yol: String Classini kullanarak
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input = "All is well";
        StringBuilder str=new StringBuilder();
        str.append(input);//StringBuilder methodudur ekleme yapar
        System.out.println("str = " + str);
        String tersInput=str.reverse().toString();//reverse ile tersine cevrildi toString ile Stringe cevrildi
        System.out.println("tersInput = " + tersInput);
        System.out.println("2. yol");
        int sonHarf=input.length()-1;

        for (int i = sonHarf ; i >=0 ; i--) {
            System.out.print(input.charAt(i));//her bir karakteri alip yazdirdik yanyana
        }
    }

    /*
    math yuontemiyle


    package day13_interviewQuestions;
import java.util.Scanner;
public class Q02_ArmstrongNumber_4Digits {

    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
        5 basamakli : 54748


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        String strSayi = scan.next();
        armstrongMethod(strSayi);
    }
    private static void armstrongMethod(String strSayi) {
        String basamak[] = strSayi.split("");
        int toplam = 0;
        for (int i = 0; i < basamak.length; i++) {
            toplam += Math.pow(Integer.valueOf(basamak[i]), basamak.length);
            System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));//2 uzeri 3 = 8
        }
        if(Integer.valueOf(strSayi)==toplam)
            System.out.println("bu bir armstrong sayidir");
        else System.out.println("bu bir armstrong sayi degildir...");
    }
}
     */
}
