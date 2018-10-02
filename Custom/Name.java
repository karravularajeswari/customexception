package Custom;

//import javax.naming.InvalidNameException;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n=new Name();
		n.name("Raje");
		
		

	}
	public static void name(String s)
	{
		if(s.length()>=3)
		{
			try{
			if(s.charAt(0)>=65 && s.charAt(0)<=90)
			{
			throw new InvalidNameException();
			}
			else
			{
				System.out.println("not valid");
			}
			}
			catch(InvalidNameException e)
			{
				System.out.println("valid");
			}
		
		}
	}

}
