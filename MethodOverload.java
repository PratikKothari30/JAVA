package Sapjava;

public class MethodOverload {
void sum (int a, int b)
{
System.out.println("sum is "+(a+b)) ;
}
void sum (int a, int b, int c)
{
System.out.println("sum is "+(a+b+c)) ;
}
void sum (double a, double b)
{
System.out.println("sum is "+(a+b));
}
public static void main (String[] args)
{
MethodOverload cal = new MethodOverload();
System.out.println("Pratik Kothari");
System.out.println("Method Overloading");
cal.sum (8,5); //sum(int a, int b) is method is called.
cal.sum (5,5,5); //sum(int a, int b,int c) is method is called.
cal.sum (4.6, 3.8); //sum(double a, double b) is called.
}
}