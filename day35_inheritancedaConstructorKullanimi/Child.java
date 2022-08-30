package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    Child(){
        System.out.println("Child constructor calisti");
    }


    public static void main(String[] args) {


        AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmal icin Grandpa cons. calisir,
        // Parent veya Child cons calismaz


        Child child1=new Child();
        child1.granpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        // child1 objesi icin Child cons calisir
        /*
        Java da bir class i kullanabilmek icin
        o class dan obje olusturur,dolasiyla
        o class in constructor ini kullanirdik

        Java inheritance da parent class larda ki
        ozellikleri kullanabilmel icin
        o class larin constructor larini
        otomatik calistiran bir yapi kurmustur.

        Ornegin biz child class inda
        Child class indan bir obje olusturmak istedigimizde
        Child constructor ını kullaniriz

        Java Child(){} gordugunde
        once parent in constructor ini calistirmam lazim der
        buradan parent constructor a gider
        Parent class ind Parent(){} gorunce
        once bunun parent inin yani Grandparent cons
        calismasi gerekir der
        Boylece extends keyword olmayan class a kadar gider
        ve oradan baslayarak tum constructorlari
        asagi dogru calistirir.
         */
    }


}
