package day15_overloading_forloop;

public class C02_OverLoading {
    public static void main(String[] args) {


        /*
        Java da olusturdugumuz methodlarin isminin yaptigi isler ile uyumlu olmasini isteriz
        mesela bir String in bir bolumunu almak icin Java
        substring() method lari veye
        Verilen String deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method u var


        Java ayni isimde birden fazla method varsa hangisinin kullanilacagina
        parametre sayisi ve parametrelerin data turune gore karar verir

         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replace("J","H");

        /*
        Ayni isimde ama farkli method lari olusturmak icin
        degistirebilecegimiz seyler
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile,parametrelerin data turleri
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarda
        parametrelerin siralanisi


         */




    }
}
