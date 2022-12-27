package day16_arrays;

public class C05_Soru {
    public static void main(String[] args) {

        //Verilen bir array’deki pozitif tamsayiları toplayıp sonucu bize döndüren method oluşturun

        int[] sayılar={3,7,9,-3,-11,-50};
        System.out.println(arraydekiPozitifSayılarıTopla(sayılar));
    }

    public static int arraydekiPozitifSayılarıTopla(int[]arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam +=arr[i];

            }
        }

        return toplam;//19



    }

}
