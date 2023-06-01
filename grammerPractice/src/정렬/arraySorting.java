package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class arraySorting {

    public static void main(String[] args) {
        int[][] arr = {{1,100}, {2,500},{4,600}, {5,600}};
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        /*
        Arrays.sort(arr, Comparator.comparingInt(원소 -> 원소[1]));
         */
    }

}

