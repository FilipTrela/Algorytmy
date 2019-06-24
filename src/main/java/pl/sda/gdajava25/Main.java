package pl.sda.gdajava25;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumRecursive(array, array.length));

    }

    static int sumRecursive(int[] array, int size) {
        if(size!=0){
            return sumRecursive(array,size-1);
        }else
            return sumRecursive(array,size-1)+array[size];
    }
}
