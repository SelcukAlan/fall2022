package day13_methodOwerloading_whileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // 2 basamaklı sayılardan 7 ile bölünebilenleri yazdırınız

        for (int i = 10; i <100; i++) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        //aynı soruyu while loop ile yapalım
        int sayı=10;

        while (sayı<100){
          if (sayı%7==0){
              System.out.print(sayı+ " ");
          }
          sayı++;
        }
        //for loop ile yapılabilecek bir soruyu illa da while loop ile
        // yapmak biraz zahmetli
    }
}
