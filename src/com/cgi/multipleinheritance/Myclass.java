package com.cgi.multipleinheritance;

public class Myclass implements InterfaceA, InterfaceB {
	@Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }
}
