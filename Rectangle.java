package pratik;

import java.util.Scanner;
class Rect {
private double w,l,a;
private String colour;
Scanner d=new Scanner(System.in);
void get_length()
{
System.out.println("enter the length");
l=d.nextDouble();
}
void get_width()
{
System.out.println("enter the width");
w=d.nextDouble();
}
void get_colour()
{
System.out.println("enter the colour");
colour=d.next();
}
double find_area()
{
a=w*l;
return a;
}
String show_colour()
{
return colour;
}
}
public class Rectangle
{
public static void main(String[] args){
System.out.println("TETC16_Pratik Kothari");
Rect R1=new Rect();
Rect R2=new Rect();
System.out.println("first rectangle");
R1.get_length();
R1.get_width();
R1.get_colour();
System.out.println("second rectangle");
R2.get_length();
R2.get_width();
R2.get_colour();
String c1=R1.show_colour();
String c2=R2.show_colour();
if((R1.find_area()==R2.find_area())&&(c1.compareTo(c2)==0))
System.out.println("matching rectangle");
else
System.out.println("non matching rectangles");

}
}