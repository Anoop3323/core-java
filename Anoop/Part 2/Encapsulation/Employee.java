class Employee
{
	private String ename;
	private int id;
	private long phno;
	
	Employee(String ename, int id , long phno)
	{
		this.ename = ename;
		this.id = id;
		this.phno = phno;
	}
	public void getName(long phno)
	{
		if(this.phno == phno)
		{
			System.out.println(ename);
		}
		else
		{
			System.out.println("Ivailid phno");
		}
	}
	public void setName(String ename, long phno)
	{
		if(this.phno == phno)
		{
			this.ename = ename;
		}
		else
		{
			System.out.println("Ivailid phno");
		}
	}
	public void getId(int phno)
	{
		if(this.phno == phno)
		{
			System.out.println(id);
		}
		else
		{
			System.out.println("Ivailid phno");
		}	
	}
	public void setPhno(int id, long old_phno)
	{
		if(this.phno == phno)
		{
			this.id = id;
		}
		else
		{
			System.out.println("Ivailid phno");
		}
	}
	

	

	
}