class User
{
	public static void main(String[] args)
	{
		Bank b1 = new Bank(9876543210l, "Anoop", 695847.1d, "L0123");
		b1.getBalance("L0123");
		b1.getAcc_hold_name("L0123");

		b1.setBalance(968574.1, "L0123");
		b1.setAcc_hold_name("Rohit", "L0123");
		b1.setPwd("L@123", "L0123");
		
		b1.getAcc_hold_name("L@123");
	}
}