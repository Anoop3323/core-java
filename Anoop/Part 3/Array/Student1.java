
public class Student1 
{
	public static void main(String[] args)
	{
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		Student1 s4 = new Student1();
		Student1 s5 = new Student1();
		
		Student1 [] a = {s1,s2,s3,s4,s5};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for(Student1 b : a)		// For esch loop
		{
			System.out.println(b);
		}
	}

}
