// an Employee which consists of ename, eid, as an attribute with the suitable constructor.
class Employee
{
	String ename;
	int eid;
	Employee()
	{
		System.out.println();
	}
	Employee(String ename)
	{
		this.ename = ename;
		
	}
	Employee(String ename, int eid)
	{
		this.ename = ename;
		this.eid = eid;
		
	}
	public static void main(String[] args)
	{
		Employee a = new Employee("Ram",32145);
		System.out.println(a.ename);
		System.out.println(a.eid);
	}
}