package day10_stringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str="Java heyecandır";
        //Eğer tüm a'ları değil de sadece ilk a'yı değiştirmek isterseniz

        System.out.println(str.replaceFirst("a", "A"));//JAva heyecandır

        //sadece ilk harf ve rakamı yıldız yap

        System.out.println(str.replaceFirst("\\w", "*"));//*ava heyecandır
    }
}
