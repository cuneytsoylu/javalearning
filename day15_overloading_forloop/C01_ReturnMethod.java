package day15_overloading_forloop;

public class C01_ReturnMethod {

    public static void main(String[] args) {

        //verilem iki sayiyi carpip
        //sonucu bize donduren bir method yapalim


        int sayi1=10;
        int sayi2=5 ;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
int sonuc=sayi1*sayi2;

        return sonuc;
    }

}
