class Array2
{
	public static void main(String[] args)
	{
		short [] a = {13,21,35,44,59};	

	/*	System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		for(int i = 0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		for(int i = a.length-1; i>=0;i--)
		{
			System.out.println(a[i]);
		}
		int j=0;
		while(j<=a.length-1)
		{
			System.out.println(a[j]);
			j++;
		}
		int k=a.length-1;
		while(k>=0)
		{
			System.out.println(a[k]);
			k--;
		}
		int l=0;
		do
		{
			System.out.println(a[l]);
			l++;
		}
			while(l<=a.length-1);
		int r=a.length-1;
		do
		{
			System.out.println(a[r]);
			r--;
		}
		while(r>=0);*/
		for(short b : a)
		{
			System.out.println(b);
		}
	}
}