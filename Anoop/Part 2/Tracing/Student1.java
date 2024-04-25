class Student1
{
	String name;
	int roll;
	static String cname = "Jsp";

	Student1(String n)
	{
		name = n;
		System.out.println("Account is created and name is updated");
	}
	Student1(String n, int r)
	{
		name = n;
		roll = r;
		System.out.println("Account is created and name and roll updated");
	}
	Student1(int r)
	{
		roll = r;
		System.out.println("Account is crfeated and roll is updated");
	}
	Student1()
	{
		System.out.println("Account is created and data is not updated");
	}
	public void printDetails()
	{
		System.out.println(name);
		System.out.println(roll);
	}
	public static void main(String[] args)
	{
		Student1 s1 = new Student1();
		s1.printDetails();
		Student1 s2 = new Student1(5);
		s1.printDetails();
		Student1 s3 = new Student1("Dev", 5);
		s3.printDetails();
		Student1 s4 = new Student1("Devi",50);
		s4.printDetails();
		Student1 s5 = new Student1("Devilal");
		s5.printDetails();
	}
}