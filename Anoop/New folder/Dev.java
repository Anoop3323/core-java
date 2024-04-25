class Dev
{
	public static void main(String[] args)
	{
		System.out.println("I am Main");
		main();
		main(6);
		main('R');
		main(true);
		main(45.1f);
	}
	public static void main()
	{
		System.out.println("I am Main 2");
	}
	public static void main(int i)
	{
		System.out.println("I am Main 3");
	}
	public static void main(char c)
	{
		System.out.println("I am Main 4");
	}
	public static void main(boolean b)
	{
		System.out.println("I am Main 5");
	}
	public static void main(float f)
	{
		System.out.println("I am Main 6");
	}

}