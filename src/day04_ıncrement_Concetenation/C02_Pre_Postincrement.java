package day04_ıncrement_Concetenation;

public class C02_Pre_Postincrement {
        public static void main(String[] args) {

            int a=10;

            int b=a++;

            int c=++a;

            System.out.println(a+ " ,"+ b + " ," + c);//12 10 12


            int x=20;

            int y=++x;

            int z=y++;

            System.out.println();

            System.out.println(x+ " ,"+ y + " ," + z);//21 22 21

            int k=30;
            System.out.println(k++);//30

            System.out.println(++k);//32

            System.out.println(k++);//32

            System.out.println(k);//33


            int sayı1=40;

            int sayı2=sayı1++;


            int sayı3=--sayı2;

            int sayı4=--sayı1;

            System.out.println(sayı1+" ,"+sayı2+ " ,"+ sayı3+ " ,"+sayı4);//40 39 39 40

        }
}
