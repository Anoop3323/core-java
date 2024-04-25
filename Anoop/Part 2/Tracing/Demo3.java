class Demo3
{
	int a = 10;
	int b ;

	{
		System.out.println("I am non static multi line initializer");
	}
	public Demo3()
	{
		System.out.println("I am constructor");
		System.out.println(b);
		b = 20;
	}
	public void add()
	{
		System.out.println("I am ADD mathod");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Demo3 d = new Demo3();
		System.out.println(d);
		System.out.println(d.a);
		System.out.println(d.b);
		d.add();

		Demo3 d1 = new Demo3();
		Demo3 d3 = new Demo3();

		d3.a = 90;
		d1.a = 78;

		d3.add();
		d1.add();
		d.add();
	}
	
}