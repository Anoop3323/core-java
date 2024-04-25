class Detail
{
	String name;
	long no;
	int id;
	String email;
	boolean result;
	float percentage;
	char gender;
	
	Detail()
	{
		
	}
	Detail(String name)
	{
		this.name = name;
	}
	Detail(long no, int id)
	{
		this.no = no;
		this.id = id;
	}
	Detail(char gender, String name)
	{
		this.gender = gender;
		this.name = name;
	}
	Detail(int id, String email, float percentage)
	{
		this.id = id;
		this.email = email;
		this.percentage = percentage;
	}
	Detail(String email, char gender, int id, long no, float percentage,String name, boolean result)
	{
		this.email = email;
		this.gender = gender;
		this.id = id;
		this.no = no;
		this.percentage = percentage;
		this.name = name;
		this.result = result;
	}
	public static void main(String[] args)
	{
		Detail a = new Detail("alice12@gmail.com", 'M', 123456, 997233332, 67.7f, "Alice", true);
		
		System.out.println(a.email);
		System.out.println(a.gender);
		System.out.println(a.id);
		System.out.println(a.no);
		System.out.println(a.percentage);
		System.out.println(a.name);
		System.out.println(a.result);
	}

}