package Pratik;

import java.util.Scanner;

public class SortName {

	public static void main(String[] args) {
	   int i,j,n;
	   Scanner ip = new Scanner (System.in);
	   System.out.println("TETC16_Pratik Kothari");
	   System.out.println("How many strings you want to enter?");
	   n=ip.nextInt();
	   String name[]= new String[n+1];
	   System.out.println("enter string:");
	   for(i=0;i<n;i++)
		   name[i]=ip.next();
	   for(i=0;i<n;i++)
	   {
		   for(j=i+1;j<n;j++)
		   {
			   if(name[i].trim().compareTo(name[j].trim())>0)
			   {
				   String temp=name[i];
				   name[i]=name[j];
				   name[j]=temp;
			   }
		   }
	   }
	   System.out.println("sorted list is: ");
	   for(i=0;i<n;i++)
		   System.out.println(" "+name[i]);
	   

	}

}