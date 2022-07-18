
package com.mycompany.mavenproject2;
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        for (int j =2*a;j>0;j=j-2)
        {
            for(int k=j/2;k>0;k--)
            {
                System.out.print('*');
            }
            
            for(int i =2*a-j;i>0;i--)
            {
                
                System.out.print(' ');
            }
              for(int k=j/2;k>0;k--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        }
          
        
    }

