class Print
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 0;
		for(int a= 1; a<=3; a++)
		{
			for(int b= 1; b<=4; b++)
			{
				if(b%2 !=0)
				{
				System.out.print(i);
				}
				else
				{
				System.out.print(j);
				}	
			}
				System.out.println();
		}
	}
}
/*{
	public static void main(String[] args)
	{
	
		for(int a=1; a<=3; a++)
		{
			for(int b=1; b<=4; b++)
			{
				{
				System.out.print((b%2 !=0)? 1:0);
				}
			}
				System.out.println();
		}
		
	}
}*/
