import java.lang.*;
import java.util.*;
class Swap
{
public static void main(String[] args)
{
 int a=Integer.parseInt(args[0]);
 int b=Integer.parseInt(args[1]);
 a=a+b;
 b=a-b;
 a=a-b;
 System.out.println("after swaping a ="+a+"after swaping b=" +b);
}
}