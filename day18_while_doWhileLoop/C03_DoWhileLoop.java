package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

     /*
     while loop da once kontrol edip sonra islem yaptıgımız icin
      islem bittikten sonra loop un kırılması ıcın bir kez daha
     basa donmemeiz gerekiyor bu durumda fazladan bir islem yapılıyor

      */
         int sayi=7;

         while (sayi<10){


             System.out.println(sayi);
             sayi++;

         }


         /*
         do-while loop ile calistigimizda bu dezavantaj ortadan kalkar
          */
         sayi=7;
         do{

         sayi++;

         }while (sayi<10);








    }
}
