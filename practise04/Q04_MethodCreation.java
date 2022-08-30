package practise04;

import java.util.Scanner;

public class Q04_MethodCreation {
    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("metre ve km ye donusturmek istediginiz cm degerini giriniz: ");
        double santiMeterValue=scan.nextDouble();

        convertSM(santiMeterValue);

    }

    public static void convertSM(double santiMeterValue) {
        double meter=santiMeterValue/100;
        double kMeter=santiMeterValue/100000;
        System.out.println("girdiginiz santimetre degeri : "+ santiMeterValue +" "+ meter+"metredir,"+kMeter+"km dir");

    }
}
