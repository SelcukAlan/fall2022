package day12_methodCreation;

public class C04_Faktoryel {
    public static void main(String[] args) {

        //Verilen bir sayının 15 'den küçük pozitif bir tamsayı olduğunu kontrol edin
        //küçükse bir method oluşturup faktöriyel değerini yazdırın
        //sayı istenilen aralıkta değilse uyarı yazdırın

        int input=5;

        if (input>0 && input<15){
            faktöryelYazdır(input);
        }else {
            System.out.println("Girilen sayı 15'den küçük pozitif tamsayı olmalıdır");
        }
    }

    public static void faktöryelYazdır(int sayı){

        int faktoryelSonucu=1;

        for (int i = sayı; i >=1 ; i++) {
            faktoryelSonucu*=i; //her loopta gelen sonucu önceki değer ile çarpalım
        }

        System.out.println("Girilen "+sayı+ "için faktöriyel:"+faktoryelSonucu);


    }



}
