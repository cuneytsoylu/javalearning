package day10_stringManipulation;

public class C06_ındexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//bana ınteger donduruyor
                                            // int de yok diye bir deger bulunmuyor
                                            // 0 dersek J nın index idir
                                            //- bir deger donerse biz aranan stringin str da olmadigini anlariz
                                            // Java -1 dondurmeyi tercih etmistir

        String str5="guencakgfokvnhrktsşehjudjhansvbrcxgdmgkfjnxhdvcımvbçxvc";

        //str5 de p harfi kullanılmış mıdır ?
        //
        if (str5.indexOf("=")==-1){
            System.out.println("str5 de istenen karakter kullanılmamis:");

        }else{
            System.out.println("str5 de istenen karakter kullanılmıs");
        }


    }
}
