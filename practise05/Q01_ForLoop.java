package practise05;

public class Q01_ForLoop {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("for dongusu ile : ");
        for (int i = 0; i <=255 ; i++) {
            char c = (char) i;// casting yaptim,sayi harf ve karakter icin
            System.out.print(i+ " -> "+c);

        }
        System.out.println("");
        System.out.println("while ile cozum : ");
        int i = 0;
        while (i <= 255){
            char sembol= (char) i;// casting yaptim
            System.out.print(i+ " - "+sembol);
i++;

        }
        System.out.println(" ");
        System.out.println("do-while ile : ");
         int a= 0;

        do {
            char c = (char) a;// casting yaptim
            System.out.print(a + " - " +c);
            a++;

        }while (a <= 255);

    }
}
