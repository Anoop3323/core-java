class Facebook
{
	private String fname;
	private int fid;
	private long pass;
	
	Facebook(String fname, int fid, long pass)
	{
		this.fname = fname;
		this.fid = fid;
		this.pass = pass;
	}
	public void getFname(long pass)
	{
		if(this.pass == pass)
		{
			System.out.println(fname);
		}
		else
		{
			System.out.println("Invailid pass");
		}
	}
	public void setFname(String fname, long pass)
	{
		if(this.pass == pass)
		{
			this.fname = fname;
		}
		else
		{
			System.out.println("Invailid pass");
		}
	}
	public void getFid(long pass)
	{
		if(this.pass == pass)
		{
			System.out.println(fid);
		}
		else
		{
			System.out.println("Invaulid pass");
		}
	}
	public void setFid(int fid)
	{
		if(this.pass == pass)
		{
			this.fid = fid;
		}
		else
		{
			System.out.println("Invailid pass");
		}
	}
	public void setPass(long pass, long old_pass)
	{
		if(this.pass == old_pass)
		{
			this.pass = old_pass;
		}
		else
		{
			System.out.println("Invailid pass");
		}
	}
}