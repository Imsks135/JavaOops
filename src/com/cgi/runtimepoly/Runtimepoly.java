package com.cgi.runtimepoly;

class A{
    void print(){
        System.out.println("Base class");
    }
}
class B extends A{
    void print(){
        System.out.println("Derived class");
    }
}
class C extends A{
    void print(){
        System.out.println("Next derived class");
    }
}
public class Runtimepoly {
    public static void main(String[] args){
        A a;
        a=new B();
        a.print();

        a=new C();
        a.print();
    }
}

