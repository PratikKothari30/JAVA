package Pratik;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int count,b,temp,c;
		int a[]= new int[10];

		System.out.println("how many integers you want to enter:");
		count = read.nextInt();
		System.out.println("enter values:");
		for(b=0;b<count;b++)
		{
			
			temp= read.nextInt();
			a[b]=temp;
			
		}
		System.out.println("The array before sorting:");
		for(b=0;b<count;b++) {
			System.out.println(a[b]+" ");
		}
		System.out.println("The array after sort:");
		for(b=0;b<count;b++)
		{
			for(c=0;c<count-b-1;c++)
			{
				if(a[c]>a[c+1]) {
					temp=a[c];
					a[c]=a[c+1];
					a[c+1]=temp;
				}
			}
		}
		for(b=0;b<count;b++)
		{
			System.out.println(a[b]+" ");
		}
	}

}