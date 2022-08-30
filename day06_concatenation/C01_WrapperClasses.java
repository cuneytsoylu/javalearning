package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz için
        primitive data turlerinin herbiri çin actigi class lardir
         int--> Integer
         char--> Character
         digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

         String str ="Java ile hayat ne guzel";

        System.out.println(str.toUpperCase()); //JAVA ILE HAYAT NE GUZEL

        boolean guzelMı=true;
        //guzelMI.  boolean primitive olduğundan hazır methodu bulunmuyor

        Boolean buGuzelMI=true;
        buGuzelMI.toString();

        System.out.println(Short.MAX_VALUE);// -32768
        System.out.println(Short.MAX_VALUE);// 32767

        String ogrNo="123456";

        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sayi giriniz");

        String sifre=scan.nextLine();
         Integer sifreSayi=Integer.parseInt(sifre);


        System.out.println("girilen sifrenin 3 fazlasi : "+(sifre +3));
        System.out.println("Integer  sifrenin 3 fazlasi " +(sifreSayi+3));

        /*
        Wrapper class lar ilerde kullanabilecegimiz pek cok hazir method icerir

         */

    }
}
