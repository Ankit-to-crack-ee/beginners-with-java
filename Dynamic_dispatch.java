
package com.mycompany.dynamic_dispatch;

class car{
    public void speed(){
      System.out.println("max speed:180kmph");
    }
    public void price(){
        System.out.println(" price:5lakh");
        
    }
}

    class supercar extends car{
       @Override
       public void speed(){
           System.out.println("max speed:400kmph");
       }
       public void modelname(){
           System.out.println("Rolce Royce Phantom");
       }
    }

public class Dynamic_dispatch {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        car s= new supercar();//dynamic dispatch :s ia car of supercar type
        s.speed();
        s.price();  //s cannot call method of supercar but it can call of parent class but it can override methods of parent class; this type of 
                    //method handling is called dynamic dispatch;
        //s.modelname  gives error as s is car type and it doesnot have model
    }
}
