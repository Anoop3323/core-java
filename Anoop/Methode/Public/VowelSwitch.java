class VowelSwitch
{
	public static void main(String[] args)
	{
		char n = 'a';
		scott(n);
	}
	public static void scott(char n)
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
				System.out.println("Not vowel");
				break;
			}
		}
	}
}