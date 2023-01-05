class Employee
{
	private int empid;  //Data Hiding

	public void SetEmpID(int eid) //Setter Method
	{
		empid=eid;
	}//SetEmpID()

	public int GetEmpID() //Getter Method
	{
		return empid;
	}//GetEmpID()
}//class Employee
class Company
{
	public static void main(String [] args)
	{
		Employee e=new Employee();
		e.SetEmpID(102);
		System.out.println(e.GetEmpID());		
	}//main()
}//class Company
