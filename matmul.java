import java.util.Scanner;
public class matmul
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r1 = sc.nextInt();
		System.out.print("\n");
		System.out.print("Enter no of columns");
		int c1 = sc.nextInt();
		System.out.print("\n");
		int[][] mat1 = new int[r1][c1];
		for(int i =0; i<r1 ; i++)
		{
			for(int j=0; j<c1 ; j++)
			{
				System.out.print("Enter element : ");
				mat1[i][j] = sc.nextInt();
				System.out.print("\n");
			}
		}
		

		System.out.print("Enter no of rows");
		int r2 = sc.nextInt();
		System.out.print("\n");
		System.out.print("Enter no of columns");
		int c2 = sc.nextInt();
		System.out.print("\n");
		int[][] mat2 = new int[r2][c2];
		for(int i =0; i<r2 ; i++)
		{
			for(int j=0; j<c2 ; j++)
			{
				System.out.print("Enter element : ");
				mat2[i][j] = sc.nextInt();
				System.out.print("\n");
			}
		}
		
		if(r2!=c1)
		{
			System.out.println("not possible");
		}
		
		else
		{
			int[][] mat3 = new int[r1][c2];
		for(int i =0; i<r1 ; i++)
		{
			for(int j=0; j<c2 ; j++)
			{
				for(int k = 0; k<r2 ; k++)
				{
					mat3[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		
				
		for(int i =0; i<r1 ; i++)
		{
			for(int j=0; j<c2 ; j++)
			{
				System.out.print(mat3[i][j] + "\t");
			}
			System.out.print("\n");
		}	
			
		}
		
	}
}
