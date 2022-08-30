package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java da bilgisayarimizdak bir dosyaya erismek istiyorsak
        FileInputStream Class indan yardim aliriz.
        Ayni sekilde JAva dan bilgisayarimizdaki   bir dosyaya
        ekleme veya update yapmak istersek
        FileOutStream Class indan yardim aliriz
         */


        FileInputStream fis=new FileInputStream("src/day39_exceptions/test.txt");

        /*
        Goruldugu gibi compile time da altini kirmizi cizen her durum
        Compile Time Error degildir
        Java da bazi exceptiomlar da
        Compile Time Exception dir
        Ozellkikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile Time Exception dir


        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1-try-catch ile cevrelemek
        2-method signature ina throws keyword ile beklenen exception turunu yazmak

        throws Exceptions , sadece olayin farkinda oldugumuzun deklarasyonudur
        exception in handle edilmesinde hicbir rolu yoktur
        Yani try catch ile kontrol altina aldigimiz exceptionlar da
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda JAva bir exception ile karsilasirsa
        hic bir sey yapmamisiz gibi hata mesaji yayinlayip,calismayi durdurur
         */

    }
}
