package miracHoca;

import java.util.Scanner;

public class Solutions {


/*hocam matematikde (30*hour) - (5.5*minutes) ya da [11*munites - 60*hour]/2 formullerini

            kullanıyoruz*/

    public static void main(String[] args) {
        angleClock(12,30);

    }




    public static double angleClock(int hour, int minutes) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen saat degerini giriniz");
       hour=scan.nextInt();
        System.out.println("lutfen dakika degerini giriniz");
       minutes=scan.nextInt();

       double angleClock=(360-(30*hour) - (5.5*minutes));

        System.out.println("girdiginiz degerlerin açı ölçüsü : " +Math.abs(angleClock));
return angleClock;
    }
}
