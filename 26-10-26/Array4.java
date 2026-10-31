
package Fundamentals;

import java.util.Arrays;

public class Array4 {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2 = {6, 7, 8, 9, 10};

        int[] a = new int[intArray.length + intArray2.length];

        System.arraycopy(intArray, 0, a, 0, intArray.length);
        System.arraycopy(intArray2, 0, a, intArray.length, intArray2.length);

        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
