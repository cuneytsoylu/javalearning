package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str="Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");


        System.out.println(str ==str2);// false

        System.out.println(str==str3);// true

        System.out.println(str.equals(str3));// true

        System.out.println(str==str5);//false

        System.out.println(str.equals(str5));//true
        System.out.println(str.equals(str4));//true
        System.out.println(str3.equals(str5));//true
        System.out.println(str3==str5);//false

        /*
        String lerde ayni String olsa bile == her zaman calismaz
        emin olmakisterseniz equal() kullanmalisiniz

        equals () kullandiginizda dikkat edecegimiz TEK SEY metinlerin bire-bir ayni olmasidir

         */

    }
}
