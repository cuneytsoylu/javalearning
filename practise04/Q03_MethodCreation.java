package practise04;

public class Q03_MethodCreation {
    /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */
    public static void main(String[] args) {

        birKereYazdir("abbbbbbaaacccddd");


    }

    public static void birKereYazdir(String str) {

String output="";//String default degeri "" oldugu icin isleme etki etmesin diye bu sekilde atama yaptık

        for (int i = 0; i <str.length() ; i++) {//int i = 0; i <=str.length()-1 ; i++

            if (!output.contains(str.substring(i,i+1))){// tekrarsiz karakterleri dondurecegimiz icin sonucumuz str den aldigimiz herhengi bir karakteri icermesin
                output += str.substring(i,i+1);// o zaman sonuca eklesin

            }

        }
        System.out.println(output);

    }


}
