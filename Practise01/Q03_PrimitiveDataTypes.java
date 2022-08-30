package Practise01;

public class Q03_PrimitiveDataTypes {
    /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */


    public static void main(String[] args) {

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int intmax=Integer.MAX_VALUE;
        int intmin=Integer.MIN_VALUE;
        System.out.println("intmax = " + intmax);
        System.out.println("intmin = " + intmin);

        byte byteMax =Byte.MAX_VALUE;
        byte byteMin =Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        long longMax=Long.MAX_VALUE;
        long longMin=Long.MIN_VALUE;
        System.out.println("longMax = " + longMax);
        System.out.println("longMin = " + longMin);

        double doubleMax=Double.MAX_VALUE;
        double doubleMin=Double.MIN_VALUE;
        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin);

        float floatMax=Float.MAX_VALUE;
        float floatMin=Float.MIN_VALUE;
        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);

        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)

        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float LaptopFiyat = 999.99f;
        double kilometre= 34.56;
        char seviye= 'A';
        boolean dogruMU=true;
        System.out.println("LaptopFiyat = " + LaptopFiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("seviye = " + seviye);
        System.out.println("dogruMU = " + dogruMU);



    }

}
