package Custom;

import java.util.Scanner;

public class InvalidId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		Id(n);

	}
	public static void Id(int id)
	{
		try{
		if(id<0)
		{
			throw new InvalidIdException();
			
		}
		else
		{
			System.out.println("valid");
		}
		}
		catch(InvalidIdException e)
		{
			System.out.println("not valid");
		}
	}

}
