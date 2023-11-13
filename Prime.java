import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		System.out.print("\n");
		
		int flag = 0;
		
		for(int i =2; i<n/2; i++)
		{
			if(n%i == 0)
			{
				flag++;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
}
