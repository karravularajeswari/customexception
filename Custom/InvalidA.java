package Custom;
import java.util.*;


public class InvalidA {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		//try{
		invalid(n);
		//System.out.println(rs);
		//}
		
		
		
	}
	public static void invalid(int age)
	{
		try{
		if(age<18)
		{
		
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("valid for voting");
		}
		
		}
		catch(InvalidAgeException e)
		{
			System.out.println("not valid for voting");
		}
		
		
		
	}

}
