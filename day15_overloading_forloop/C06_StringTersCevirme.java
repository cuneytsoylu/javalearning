package day15_overloading_forloop;

public class C06_StringTersCevirme {
    public static void main(String[] args) {

        //input olarak verilen  Stringi terse cevirip yazdiran bir method olusturun

        String input = "Java gun gectikce guzellesiyor";

        terstenYazdir(input);



    }

    public static void terstenYazdir(String input) {

        String tersinput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {

            tersinput+=input.substring(i,i+1);

        }
        System.out.println(tersinput);
    }
}
