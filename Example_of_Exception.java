import java.util.*;

class Invalid_rollno extends Exception
{
	public String ExceptionOccur()
	{
		return("Invalid_rollno");
	}
}
public class Example_of_Exception {
	public static void main(String[] args) {
		System.out.println("Pratik Kothari \n");
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter your Rollno. : ");
			int roll=s.nextInt();
			
		if(roll<77)
		{
			System.out.println("Example of Exception-Handling is correct\n Roll no. :"+roll);
		}
		else
		{
			throw new Invalid_rollno();
		}
		}
		catch(Invalid_rollno e)
		{
			System.out.println("Error Occured in Example :" +e);
		}
	}

}
