package day14_doWhileLoop_scope;

public class C05_Scope {

    int sayı=10;
    static int number;

    public static void main(String[] args) {
      String mainStr="java";
      number=10;
      //sayı=20;
      //System.out.println(mainStr);
        for (int i = 0; i < 10; i++) {
            int toplam=i;
        }
       // System.out.println(toplam);
       // System.out.println(i);


    }

    public static void method1(){
        String method1Str="güzeldir";
        number=20;
        //sayı=20;
        //System.out.println(mainStr);
    }
    public void method2(){
        String method2Str="candır";
        number=30;
        sayı=30;
        //System.out.println(mainStr);
    }
}
