package day11_stringManipulation;

public class C02_lastIndexof {
    public static void main(String[] args) {


        String cumle="Java cok kolay, Java cok kolay guzel";
        String kelime="Java";
         /* verilen kelime icin asagıda ki sartlardan uygun olani yazan bir program yaziniz
        -verilen kelime cumlede kullanilmamis
        -verilen kelime cumlede sadece 1 kere kullanilmis
        -verilen kelime cumlede birden fazla kullanilmamis

          */
        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        if (kelimeIlkIndex==-1) {
            System.out.println("verilen kelime cumlede kullanilmamis");
        }else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmamis");
        }

    }
}
