class Student
{
	private String name;
	private int roll;
	private long phno;
	
	Student(String name, int roll, long phno)
	{
		this.name = name;
		this.roll = roll;
		this.phno = phno;
	}
	public void getName(long phno)
	{
		if(this.phno == phno)
		{
			System.out.println(name);
		}
		else
		{
			System.out.println("Invailid phno");
		}
		
	}
	public void setName(String name, long phno)
	{
		if(this.phno == phno)
		{
			this.name = name;
		}
		else		
		{	
			System.out.println("Invailid phno");
		}
	}
	public void getRoll(long phno)
	{
		if(this.phno == phno)
		{
			System.out.println(roll);
		}
		else
		{
			System.out.println("Invailid phno");
		}
	}
	public void setPhno(int roll,long old_phno)
	{
		if(this.phno == old_phno)
		{
			this.roll = roll;
		}
		else
		{
			System.out.println("Invailid phno");
		}
	}
}