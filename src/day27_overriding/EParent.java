package day27_overriding;

public class EParent extends DGrandParent{

    @Override
    protected void method1() {
        System.out.println("P method1");


    }

    protected void method2(){
        System.out.println("P method2");

    }

    private void method3(){
        System.out.println("Child method3");





    }


}
