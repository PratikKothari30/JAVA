package Atharva;
interface cars
{
	public void sedan();
	public void exotic();
	public void suv();
	
}
class carsname implements cars
{
	public void sedan()
	{
		System.out.println("THE SEDAN CARS ARE: 1.MERCEDES BENZE S-CLASS 2. BMW M3 3. LEXUS LS");
		
	}
	public void exotic()
	{
		System.out.println("THE EXOTIC CARS ARE: 1.AUDI R8 2. BMW I8 3. BUGTTI CHIRON");
		
	}
	public void suv()
	{
		System.out.println("THE SUV CARS ARE: 1.TOYOTA LAND CRUIER 2. AUDI Q5 3. LAMBORGINI URUS");
		
	}
}
public class Interfaces 
{
public static void main(String [] args)
{
	carsname c = new carsname();
    c.sedan();
    c.exotic();
    c.suv();
}
}
