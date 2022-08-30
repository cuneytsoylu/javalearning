package day38_exceptions;


        import java.util.InputMismatchException;
        import java.util.Scanner;
public class C03_Exceptions {
            public static void main(String[] args) {

        /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim
         */
                    String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
                    Scanner scan;
                    int istenenSira = 0;
                    boolean kontrol = true;
                    while (kontrol) {
                        try {
                            scan = new Scanner(System.in);
                            System.out.println("Istediginiz urunun sira nosunu giriniz");
                            istenenSira = scan.nextInt();
                            kontrol = false;
                        } catch (InputMismatchException deneme) {
                            System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
                        }
                    }
        /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */
                    try {
                        System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                                "\nSira numarasi en fazla : " + urunler.length + " olabilir");
                    }
                }
}

/*

        Marketteki tum urunleri bir array'de tuttugumuzu varsayilim
        Kullaniciya index sorup o index'teki urunu yazdiran bir program  hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim*/
   /*

   WHİLE İLE

String[] urunler={"Nutella","Cokokrem","Sut","Findik"};
    Scanner scan=new Scanner(System.in);
        System.out.print("Istediginiz urunun sira no'sunu giriniz : ");
                int istenenSira=0;
                while(true){
                try {//------------------------------------->>1-)risk olan kismi yazar
                istenenSira=scan.nextInt();
                } catch (InputMismatchException deneme) {//----------------->2-)yakalanacak exc. turu ve icine konulacak obje
                System.out.println("Urun index'i icin bir tamsayi girmelisiniz");//--->3-)catch blogu yakalaninca
                System.out.println("deneme = " + deneme);                                                 // ne yapilacagimiz yazar
                }
        /*
        catch blogunun onundeki parantezde exception class'inin ismi ve yaninda
        yakalanan exception 'i atadigimiz variable'in ismi olur(e)
        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz
        Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci
        yoksa e kullanilmasa da kod calisir
         */
               /* if(istenenSira!=0||istenenSira!=1 ||istenenSira!=2 ||istenenSira!=3 ){
                System.out.println("Lutfen tekrar deneyiniz");
                try {//------------------------------------->>1-)risk olan kismi yazar
                istenenSira=scan.nextInt();
                } catch (InputMismatchException deneme) {//----------------->2-)yakalanacak exc. turu ve icine konulacak obje
                System.out.println("Urun index'i icin bir tamsayi girmelisiniz");//--->3-)catch blogu yakalaninca
                System.out.println("deneme = " + deneme);                                                 // ne yapilacagimiz yazar
                }
                }else break;
                try {
                System.out.println("urunler[istenenSira] = " + urunler[istenenSira-1]);
                } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Lutfen sira hmmm");
                }
                }
                }
 */
