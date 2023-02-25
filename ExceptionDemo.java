import java.util.*;

class Invalid_Age extends Exception{
	public String ExceptionOccur()
	{
		return("Invalid Age_format");
	}

}

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Pratik Kothari \n");
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter Your Age : ");
			int Age=s.nextInt();
			
			if(Age>0)
			{
				System.out.println("Example of Age limit is correct\n Age is:"+Age);
			}
			else {
				throw new Invalid_Age();
			}
		}
		catch(Invalid_Age e)
		{
			System.out.println("Error Occured in Example : "+e);
		}
	}
}
