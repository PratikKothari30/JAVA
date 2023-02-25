package Pratik;

import java.util.Scanner;

public class Playerdetail {

	public static void main(String[] args) {
	cricket ck=new cricket();
	hockey hk=new hockey();
	football fb = new football();
	Scanner read = new Scanner (System.in);
	int op1 , op2;
	System.out.println("Pratik Kothari");
	while(true)
	{
		System.out.println("1. enter details 2. display 3. exit");
		System.out.println("enter your option");
		op1 = read.nextInt();
		switch(op1)
		{
		case 1:
			System.out.println("1. football player 2. hockey plyer 3. cricket player");
			System.out.println("enter your option");
			op2 = read.nextInt();
			switch(op2)
			{
			case 1 :
				System.out.println("enter name:");
				fb.name = read.next();
				System.out.println("enter skill :");
				fb.skill = read.next();
				System.out.println("enter age:");
				fb.age = read.nextInt();
				break;
				
			case 2 :
				System.out.println("enter name:");
				hk.name = read.next();
				System.out.println("enter skill :");
				hk.skill = read.next();
				System.out.println("enter age:");
				hk.age = read.nextInt();
				break;
			case 3 :
				System.out.println("enter name:");
				ck.name = read.next();
				System.out.println("enter skill :");
				ck.skill = read.next();
				System.out.println("enter age:");
				ck.age = read.nextInt();
				break;
			}
			break;
		case 2:
			System.out.println("1. football player 2. hockey player 3. cricket player");
			System.out.println("enter your option");
			op2 = read.nextInt();
			switch(op2)
			{
			case 1:
			System.out.println("name"+ " "+fb.name);
		
			System.out.println("skill"+" "+fb.skill);
			
			System.out.println("age"+" "+fb.age);
			break;
			
			case 2:
			
			System.out.println("name"+hk.name);
			
			System.out.println("skill"+hk.skill);
			
			System.out.println("age"+hk.age);
			break;
			
			case 3:
			
			System.out.println("name"+ck.name);
			
			System.out.println("skill"+ck.skill);
			
			System.out.println("age"+ck.age);
			break;
			
			}
			break;
		case 3:
			System.exit(0);
			
			}
		}
	}
}
class playerdetails
{
	String name;
	int age;
	String skill;
	
	

	}
class football extends playerdetails
{
	
}
class hockey extends playerdetails
{
	
}
class cricket extends playerdetails
{
	
}