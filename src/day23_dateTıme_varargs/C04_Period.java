package day23_dateTıme_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1989,10,13);

        LocalDate bugun=LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);

        System.out.println(yas);//P33Y2M7D

        System.out.println(yas.getYears());//33


        LocalDate baslangıç=LocalDate.of(2010,8,5);
        LocalDate bitiş=LocalDate.of(2014,5,1);

        Period sure=Period.between(baslangıç,bitiş);

        System.out.println(sure);//P3Y8M26D


    }
}
