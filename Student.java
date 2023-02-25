package SapJava;

public class Student {
int id; //instance variables of the class
String name;
Student(){
System.out.println("TETC16_Pratik Kothari");
System.out.println("This a default constructor");
}
Student(int i, String n){
id = i;
name = n;
}
public static void main(String[] args) {
Student s = new Student(); //object creation
System.out.println("\nDefault Constructor values: \n");
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);
System.out.println("\nParameterized Constructor values: \n");
Student student = new Student(10, "Parth");
System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);
}
}