class Demo
{
	int a;
	int b;
	
	public Demo()
	{
		System.out.println("I am constructor");
	}
	public static void main(String[] args)
	{
		Demo d = new Demo();
		System.out.println("d");        //ox1
		System.out.println("d.a");    	//0
	}
}