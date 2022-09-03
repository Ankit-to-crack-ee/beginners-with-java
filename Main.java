
import java.lang.*;
import java.util.*;
public class Main{
Main(){
System.out.println("constructor Overloading");
}
Main(int a){
System.out.println("contructor Overloading"+a);
}
Main(int a,int b)
{
this(a);
System.out.println("constructor overloading"+ a +b);
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
Main ob1=new Main();
Main ob2=new Main(a,b);
}}
