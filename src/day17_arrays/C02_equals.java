package day17_arrays;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {

        int[] arr1={3,8,0};
        int[] arr2={8,3,0};

        System.out.println(Arrays.equals(arr1, arr2));//false







        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));//true

    }
}
