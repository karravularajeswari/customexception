package Custom;
import java.util.*;
public class Age {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int n=sc.nextInt();
		age(n);

	}
	public static void age(int age)
	{
		if(age<18)
		{
			System.out.println("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

}
