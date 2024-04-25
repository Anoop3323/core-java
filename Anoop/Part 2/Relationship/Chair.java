class Chair
{
	Plastic p;

	String pname;
	double price;
	char size;
	
	Chair(Plastic p, String pname, double price, char size)
	{
		this.p = p;
		this.pname = pname;
		this.price = price;
		this.size = size;
	}
	public static void main(String[] args)
	{
		Chair q = new Chair(new Plastic(), "Supreme", 2500.0, 'M');
		System.out.println(q.p);
		System.out.println(q.pname);
		System.out.println(q.price);
		System.out.println(q.size);
	}
}