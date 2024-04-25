/*Design the following requirement
	sName;
	sId;
	cNo;
PrintStudentDetails(); */
class Student1
{	
	int sid;
	String sname;
	long cno;
	Student1()
	{
		System.out.println();
	}
	Student1(int sid)
	{
		this.sid = sid;
		
	}
	Student1(String sname)
	{
		this.sname = sname;
		System.out.println();
	}
	Student1(String sname, int sid)
	{
		this.sname = sname;
		this.sid = sid;
		System.out.println();
	}
	Student1(int sid, String sname, long cno)
	{
		this.sid = sid;
		this.sname = sname;
		this.cno = cno;
		System.out.println();
	}
	public static void main(String[] args)
	{
		Student1 a = new Student1(14521,"Alice",993999903);
		System.out.println(a.sid);
		System.out.println(a.sname);
		System.out.println(a.cno);
	}
}