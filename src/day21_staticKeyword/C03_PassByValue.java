package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int sayı=20;

        System.out.println(sayı);//20

        // int sayı=30;
        //bir scop'da tanımlanan variableye'nin yeniden tanımlanma imkanı yoktur




    }

    public static void metdod1(){

        String s="Hasan";

        System.out.println(s.toLowerCase());//hasan


    }

    public static void metdod2(int s){

        s=s*s;

        System.out.println(s);





    }
}
