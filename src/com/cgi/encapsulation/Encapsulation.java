package com.cgi.encapsulation;

public class Encapsulation {
      public void getName() {
    	  System.out.println("My name is satyam");
      }
      private void getColor() {
    	  System.out.println("My color is brown");
      }
      protected void getHobby() {
    	  System.out.println("Playing games");
      }
      public static void main(String[] args) {
    	  Encapsulation en=new Encapsulation();
    	  en.getName();
    	  en.getColor();
    	  en.getHobby();
    	  
    	  Publicclass c1=new Publicclass();
    	  c1.getName();
    	  
    	  Privateclass c2= new Privateclass();
    	  //c2.getColor();
    	  
    	  Protectedclass c3=new Protectedclass();
    	  c3.getHobby();
      }
}
