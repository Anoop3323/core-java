//WAJP to creat a method which is accepting the number for calling method and printing the char is vowel or not.
class VowelOrNot
{
	public static void main(String[] args)
	{
		char n = 'a';
		
		scott(n);
	}
	 static void scott( char n)
	{
		switch(n)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			{
				System.out.println("vowel");
				break;
			}
			default:
			{
				System.out.println("Not Vowel");
			}
		}
		
	}
}