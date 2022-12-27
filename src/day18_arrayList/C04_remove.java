package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar); // [10, 5, 7, 9]

        System.out.println(sayilar.size());//4

        sayilar.clear();//Tüm elementleri siler

        System.out.println(sayilar.size());//0



    }
}
