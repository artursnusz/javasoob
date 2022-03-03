package testo_tab;

import java.util.Arrays;

class ArrayUtils {

    public int sumArrays(int[] array1, int[] array2) {
        return Arrays.stream(array1).sum() + Arrays.stream(array2).sum();
    }
}