
public class Student 
{
	int roll;
	String name;
	
	public Student(int roll, String name) 
	{
		
		this.roll = roll;
		this.name = name;
	}

	public static void main(String[] args)
	{
		Student[] s = new Student[8];
		
		s[0]= new Student(191901363, "Anoop");
		s[1]= new Student(191901364, "Aman");
		s[2]= new Student(191901365, "Jatin");
		s[3]= new Student(191901366, "Suraj");
		s[4]= new Student(191901367, "Pranesh");
		s[5]= new Student(191901368, "Sundram");
		s[6]= new Student(191901369, "Ranjeet");
		s[7]= new Student(191901370, "Shidharth");
		
//		for(int i=0; i<=s.length-1; i++)
//		{
//			System.out.println(s.clone());
//		}
		for(Student x : s)
		{
			System.out.println(x);
		}
	}
}
