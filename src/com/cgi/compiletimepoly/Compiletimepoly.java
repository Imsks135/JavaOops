package com.cgi.compiletimepoly;

class New{
    static int add(int x,int y){
        return x+y;
    }
    static double add(double x,double y, double z){
        return x+y+z;
    }
}
public class Compiletimepoly {
    public static void main(String[] args){
        System.out.println(New.add(5,6));
        System.out.println(New.add(5.1,6.1,7.1));
    }
}
