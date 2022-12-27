package day10_stringManipulation;

public class C11_ForLoop {
    public static void main(String[] args) {

        //Verilen sayının faktöriyelini hesaplayınız

       int  input=6;

       int çarpım=1;

        for (int i = input; i >=1 ; i--) {

          çarpım*=i;

        }
        System.out.println("verilen :"+ input+ "sayısının faktöriyeli :"+çarpım);


    }
}
