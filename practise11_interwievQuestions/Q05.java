package practise11_interwievQuestions;

public class Q05 {
    public static void main(String[] args) {
        int[] arr={17,23,339,20};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varargsToplaList(25,55,63,21,20);

        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
        //varargs array gibi davrandigi icin herhangi bir array i verebiliriz

    }

    private static int varargsToplaArr(int... i) {

        int toplam=0;
        for (int w:i
        ) {
            toplam+=w;

        }
        return toplam;
    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {
    }

    private static int arrTopla(int[] arr) {
int toplam=0;
        for (int w:arr
             ) {
            toplam+=w;

        }
        return toplam;
    }
}
