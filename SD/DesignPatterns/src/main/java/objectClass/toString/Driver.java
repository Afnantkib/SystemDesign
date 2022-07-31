package objectClass.toString;
//object is the base class of every class
//printline accepts object class
//and every object has toString
//

import objectClass.toString.Car;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Car c1=new Car("A",100,200);
        Car c2=null;
        System.out.println(c1);
        System.out.println(c2);
        //car class overrides toString method
        System.out.println();
        ArrayList<String> l=new ArrayList<>();

        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        System.out.println(l);
    }
}
