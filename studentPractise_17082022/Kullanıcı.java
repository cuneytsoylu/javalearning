package studentPractise_17082022;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static studentPractise_17082022.Yonetici.cikis;

public class Kullanıcı {
    static  Scanner scan =new Scanner(System.in);
    static String yanit="";
    public static void kullanici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String kullanici="\n"+"DINLEMEK ISTEDIGINIZ KANALI SECINIZ\n"+"\n"+
                "1 : POWER FM\n"+
                "2 : SLOW TURK\n"+
                "3 : VIRGIN RADIO\n"+
                "4 : METRO FM\n"+
                "5 : CIKIS";
        System.out.println(kullanici);
        yanit=scan.next();

        switch (yanit){
            case "1":

                powerFm();
                break;


case"5" :
    cikis();
    break;

        }

    }

    public static void powerFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/studentPractise_17082022/ezhel.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
Clip clip=AudioSystem.getClip();
clip.open(audioStream);

while (!yanit.equals("5")){

    System.out.println("1 : OYNAT\n"+
            "2 : DUR\n"+
            "3 : BASTAN OYNAT\n"+
            "4 : KANAL LISTESI\n"+
            "5 : CIKIS");
    yanit=scan.next();

    switch (yanit){
        case"1":
            clip.start();
            break;
        case "2":
            clip.stop();
            break;
        case "3":
            clip.setMicrosecondPosition(0);
            break;
        case"4":
            clip.stop();
            kullanici();
            break;
            case "5":
                clip.stop();
                cikis();
                break;
        default:{
            System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n"+
                    "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
            Thread.sleep(3000);

        }
    }
}



    }
}
