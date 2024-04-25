package Array1D;

public class IntType {

	public static void main(String[] args) 
	{
		int [][] a= {{1,2},
			     {3,4}};
	
		System.out.print(a[0][0]+" ");
		System.out.print(a[0][1]);
		System.out.println();
		System.out.print(a[1][0]+" ");
		System.out.print(a[1][1]);
		
		System.out.println();
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}

}
