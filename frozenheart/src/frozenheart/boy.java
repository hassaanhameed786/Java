package frozenheart;

public class boy {
	private String firstname;
	private String lastname;
	private String Address;
	private int Id;
	
	
	public boy (String name)
	{
		firstname =name;
		lastname= name;
	}
	public void setFirst_name(String name)

	{
		firstname= name ;
	}

	public void setLast_name(String name)

	{
		lastname= name;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	
	void print1()
	{
		System.out.printf("my firstname is %s", getFirstname());
	}
	void print2()
	{
		System.out.printf("my lastname name is %s", getLastname());
	}

}
