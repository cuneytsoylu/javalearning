package practise11_interwievQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/

    /*
    oncelikle Scanner olusturacagiz
    sonra split methodu olusturacagız
    sonra sort
    for loop
    if ile control
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir string ifade giriniz");

        String str = scan.nextLine();

        String arr[] = str.split("");


        System.out.println("arr = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("arr nin sort hali = " + Arrays.toString(arr));
int counter=0;
        for (int i = 1; i < arr.length; i++) {
if (arr[i-1].equals(arr[i])) {
    counter++;

}else{
    System.out.println(arr[i-1]+" karakteri "+(counter+1));
    counter=0;
}if(i== arr.length-1){
                System.out.println(arr[i]+" karakteri "+(counter+1));
            }
        }
    }
}