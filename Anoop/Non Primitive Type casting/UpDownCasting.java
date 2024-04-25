class UpDownCasting
{
	public static void main(String[] args)
	{
		Tree t = new Mango(); //upcasting
		//Tree t = new Coconut(); //Upcasting		

		//t.m1();
		//t.m2();

		if(t instanceof Mango)
		{
			Mango m = (Mango)t; //downcasting
			System.out.println(m.price);
			m.alice1();	
		}
		else if(t instanceof Coconut)
		{
			Coconut c = (Coconut)t; //downcasting
			System.out.println(c.price);
		}
			System.out.println("End");
	}
}