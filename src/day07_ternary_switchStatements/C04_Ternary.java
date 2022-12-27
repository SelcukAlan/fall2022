package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        //Kullanıcıdan alına değer yüzden büyükse sayıyı iki ile çarpın
        //yüze eşit veya küçük ise sayıya on ekleyin.

        int input=45;

        // if else ile yapalım
         if (input>100){
             input*=2;

         }else {
             input+=10;
         }
        System.out.println("if else ile: " + input);
        //Ternary ile yapalım

        input=45;

        input=input>100? input*2 : input + 10;

        System.out.println("Ternary ile: " + input);


        /*
        Verilen input'u inceleyin
        eğer 100'den büyükse bunu 5'e bölüp bölüm sonucunu tek sayı olup olmadığını kontrol edin
        eğer 100'den büyük değilse 10 ile bölümden kalanı bulup bu kalanı 5 artırın


         */





    }
}
