//WAJP to creat a method which is accepting the number for calling method and printing the //char is vowel or not.
class VowelOrNot
{
	public static void main(String[] args)
	{
		char n = 'a';
		
		scott(n);
	}
	public static void scott( char n)
	{
		
		if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Not vowel");
		}
	}
}