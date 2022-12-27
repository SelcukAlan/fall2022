package day21_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,9,1,7};

        //Bir method oluşturup arr'yi methoda yollayalım
        //methodda array'in elemetleri üzerinde değişiklik yapalım ve array'i yazdıralım
        elemetleriDegiştir(arr);


    }
    public static void  elemetleriDegiştir(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));//[13, 6, 19, 1, 7]






    }


}
