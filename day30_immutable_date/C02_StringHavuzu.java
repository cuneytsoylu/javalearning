package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = str1+"";
        String str3 = new String("Ali Can");
String hiclik="";
        String str4 = str1.concat(hiclik);

        System.out.println(str1==str2);// false
        System.out.println(str1.equals(str2));// true

        System.out.println(str1.equals(str3));// true

        System.out.println(str1==str3);// false
        System.out.println(str2.equals(str4));// true
        System.out.println(str2==str4);//false

        System.out.println("s1-s4"+(str1.equals(str4)));// true
        System.out.println("s1-s4"+(str1==str4));//false
        /*
        yeni bir String olusturuken
        1-esitligin saginda new keyword u olursa java direk yeni bir obje ve ref olusturur
        2-eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa
        String immutable oldugundan degisikligi kaydetmek uzere
        hemen bir kopya String ve ref olusturur , sonra degeri hesaplayıp
        bu yeni kopya objenin icine koyar

         */

        String str5 ="Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5));// true
        System.out.println(str1==str5);//true


        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true
        System.out.println(str5.equals(str6));//true
        System.out.println(str5==str6) ;//true
        /*
        Eger yeni String objesi olusturulurken
        new kelimesi kullanilmaz veya
        esitligin saginda + islem olmazsa Java bakar

        Eger daha once olusturulan String objelerden(String Havuzu)
        bire-bir ayni String varsa
        o objeyi ve referansini kullanir,
        bire-bir aynisi yoksa yeni bir obje ve ref olusturur

         */




    }
}
