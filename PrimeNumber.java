package week1;

public class PrimeNumber {
	public static void main(String[] args) {
		int Input=13;
		int remainder;
	boolean flag=false;
		for(int i = 2; i <=Input/2; i++) 
		{
			remainder=Input%i;
		if (remainder== 0) 
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		}
		if (flag==false) 
		{
			System.out.println("Prime");
		}
			else
			{
				System.out.println("Not a Prime");
		}
	}
}

