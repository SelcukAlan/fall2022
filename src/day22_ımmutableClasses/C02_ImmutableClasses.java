package day22_ımmutableClasses;

import java.util.Arrays;

public class C02_ImmutableClasses {
    public static void main(String[] args) {


        String str="Java";

        System.out.println(str.toUpperCase());//JAVA

        str.toLowerCase();

        System.out.println(str);//Java

        //String immutable oldugundan method'lar kalıcı degişiklik yapmaz

        int [] arr={17,5,9};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[5, 9, 17]

        //Array mutable oldugu için method ile yapılan degişiklikler kalıcı olur






    }


}
