package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        //Verilen bir array'deki tekrar eden elementleri silip
        //array'i unique değerlerinde oluşan bir array haline getirin


        int [] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> benzersizElementlerListesi=new ArrayList<>();

        //array'deki tüm elementleri alıp listede var mı diye kontrol edelim ve olmayanlara ekleyelim

        for (int i = 0; i < arr.length; i++) {
          if (!benzersizElementlerListesi.contains(  arr[i])){
              benzersizElementlerListesi.add(arr[i]);
          }

        }
        System.out.println(benzersizElementlerListesi);//[4, 3, 6, 7, 5]

        // soruda bu değeri arra'e atar mısınız?

        arr=new int[benzersizElementlerListesi.size()];//[0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            arr[i]= benzersizElementlerListesi.get(i);

        }
        System.out.println("Array'ın son hali :"+ Arrays.toString(arr));//[4, 3, 6, 7, 5]
    }
}
