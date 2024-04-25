class Bank
{
	private long acc_no;		//r
	private String acc_hold_name;	//r/w
	private double balance;		//r/w
	private String pwd;		//w

	Bank(long acc_no, String acc_hold_name, double balance, String pwd)
	{
		this.acc_no = acc_no;
		this.acc_hold_name = acc_hold_name;
		this.balance = balance;
		this.pwd = pwd;
	}
	public void getAcc_no(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println(acc_no);
		}
		else
		{
			System.out.println("Invailid pwd");
		}
	}
	public void getAcc_hold_name(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println(acc_hold_name);
		}
		else
		{
			System.out.println("Invailid pwd");
		}
	}
	public void setAcc_hold_name(String acc_hold_name, String pwd)
	{
		if(this.pwd == pwd)
		{
			this.acc_hold_name = acc_hold_name;
		}
		else
		{
			System.out.println("Invailid pwd");
		}
	}
	public void getBalance(String pwd)
	{
		if(this.pwd == pwd)
		{
			System.out.println(balance);
		}
		else
		{
			System.out.println("Invailid pwd");
		}
	}
	public void setBalance(double balance, String pwd)
	{
		if(this.pwd == pwd)
		{
			this.balance += balance;
		}
		else
		{
			System.out.println("Invailid pwd");
		}
	}
	public void setPwd(String pwd,String old_pwd)
	{
		if(this.pwd == old_pwd)
		{
			this.pwd = pwd;
		}
		else
		{
			System.out.println("Invailid pwd");
		}
	}
	
}