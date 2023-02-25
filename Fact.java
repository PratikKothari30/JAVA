package pratik;

import java.util.Scanner;

public class Fact {
	public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int ch, i,num,n,sum,cnt,flag,fact;
     System.out.println("Pratik Kothari");
     do
     {
  	   System.out.println("1:Find Factorial");
  	   System.out.println("2:Display First 50 prime numbers");
  	   System.out.println("3:Find Sum and average of N numbers");
  	   System.out.println("4:Exit");
  	   System.out.print("Enter Choice=");
  	   ch= sc.nextInt();
  	   switch(ch)
  	   {
  	   case 1 :System.out.print("Enter Number =");
  	   n=sc.nextInt();
  	   fact =1;
  	   for(i=1;i<=n ;i++)
  		   fact = fact *i;
  	   System.out.println("Factorial = "  +  fact);
  	   break;
  	   case 2: cnt=1;
  	   n=2;
  	   while(cnt<=50)
  	   {
  		   flag=1;
  		   for(i=2;i<=n/2;i++)
  		   {
  			   if(n%i==0)
  			   {
  				   flag = 0;
  				   break;
  			   }
  		   }
  		 if(flag == 1)
  		 {
  			 System.out.println(n);
  			 cnt++;
  		 }
  	    n++;
  	   }
  	   break;
  	   
  	   case 3:System.out.print("Enter limit = ");
  	   n = sc.nextInt();
  	   sum = 0;
  	   for(i=1;i<=n;i++)
  	   {
  		   System.out.print("Enter number = ");
  		   num = sc.nextInt();
  		   sum = sum +num;
  	   }
  	   System.out.println("Sum = "+ sum);
  	   System.out.println("Avg = "+ (float)sum/n);
  	   break;
  	   }   
}while (ch!=4);
sc.close();
    }
}