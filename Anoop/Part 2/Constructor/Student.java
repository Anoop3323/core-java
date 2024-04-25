class Student
{
	String name;
	int roll;
	Student()
	{
		System.out.println("Hye");
	}
	Student(String name)
	{
		this.name = name;
		
	}
	Student(String name, int roll)
	{
		this.name = name;
		this.roll = roll;
		
	}
	public static void main(String[] args)
	{
		Student a = new Student("Anoop",8);
		System.out.println(a.name);
		System.out.println(a.roll);
	}
}