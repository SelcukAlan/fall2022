package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_contains {
    public static void main(String[] args) {

        int [] arr= {4,3,5,8,9,7,9,6,3,1,2,};
        List<Integer> sayılar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayılar.add(arr[i]);
        }
        System.out.println(sayılar.contains(3));//true
        System.out.println(sayılar.contains(12));//false



    }
}
