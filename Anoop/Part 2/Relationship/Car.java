class Car
{
	Engine e;

	String cname;
	double price;
	
	Car(Engine e, String cname, double price)
	{
		this.e = e;
		this.cname = cname;
		this.price = price;
	}
	public static void main(String[] args)
	{
		Car r = new Car(new Engine(), "Thar",1499999.0);
		System.out.println(r.e);
		System.out.println(r.cname);
		System.out.println(r.price);
	}
}
