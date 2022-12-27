package day16_arrays;

public class C07_Soru {
    public static void main(String[] args) {

    //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa
    // kac kere kullanildigini yazdiran bir method olusturun.

        int [] arr={2,3,4,5,6,7,4,5,1,2,4,6,3,1,9};
        int arananSayı=2;
        elemanBul(arr,arananSayı);



    }

    public static void elemanBul(int[]arr,int arananSayı){
        int sayaç=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayı){
                sayaç++;
            }
        }
        if (sayaç == 0) {

            System.out.println("Aranan sayı arrayde yok");

        }else {
            System.out.println("Aradığınız  " + arananSayı +"array'de" + sayaç + "adet kullanılmıştır");
        }



    }
}
