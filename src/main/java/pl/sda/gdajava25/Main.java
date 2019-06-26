package pl.sda.gdajava25;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumRecursive(array, array.length - 1));
        System.out.println(factorial(5));
        System.out.println(palindrom("abccba"));
        int[] array2 = new int[]{8, 4, 3, 6, 1, 7, 2, 5, 9, 10};
        for (int a : array2) {
            System.out.print(a + " ,");
        }
        System.out.println();
        int[] array3 = selectionSort(array2);
        for (int a : array3) {
            System.out.print(a + " ,");
        }
        System.out.println();
        int[] array6 = new int[]{8, 4, 3, 6, 1, 7, 2, 5, 9, 10};
        int[] array4 = insertionSort(array6);
        for (int a : array4){
            System.out.print(a + " ,");
        }

    }

    static int sumRecursive(int[] array, int size) {
        return size == 0 ? array[size] : sumRecursive(array, size - 1) + array[size];
    }

    static int factorial(int a) {
        return a == 1 ? a : factorial(a - 1) * a;
    }

    static boolean palindrom(String s) {
        s = s.toLowerCase().trim().replace(" ", "");
        if (s.length() == 1) return true;
        if ((s.charAt(0) == s.charAt(s.length() - 1))) {
            if (s.length() != 1) {
                return true;
            }
            return palindrom(s.substring(1, s.length() - 1));

        } else return false;
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i <array.length-1; i++) {
            int indeks = i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<array[indeks]){
                    indeks = j;
                }
                
            }
            int min = array[indeks];
            array[indeks] = array[i];
            array[i] = min;
        }
        return array;
    }

    static int[] insertionSort(int[] array){
        for (int a:array) {
            int lastSorted = 0;
            for (int i = lastSorted; i == 0 ; i--) {
                if(array[i]>a){
                    int tymczasowa = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tymczasowa;
                }else break;
            }
        }

        return array;
    }
}