package com.mycompany.mavenproject4;

public class Mavenproject4 {
    public static int factorial(int n)
    {
        if (n>1||n>0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
        
    }

    public static void main(int n) {
        System.out.println("Hello World!"+factorial(n));
        
    

    }
    
}