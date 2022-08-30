package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        EnUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet","Babayigit");

    }

    public static void EnUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0]; // => String enUzunKelime="";

        for(String each : kelime){
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : "+enUzunKelime);



    }
}
