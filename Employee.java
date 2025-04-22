package week10;

class Employee
{
	private int id;
	private String name;
	private double monthlySalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		if(monthlySalary>0)
		{
			return monthlySalary;
		}
		else
		{
			return 0;
		}
	}
	public void setMonthlySalary(double d) {
		this.monthlySalary = d;
	}
	public Employee(int id, String name, int monthlySalary) {
		super();
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	
	public double calculateYearlySalary()
	{
		double yearlySalary = monthlySalary*12.0;
		return yearlySalary;
	}
	void DisplayInfo()
	{
		System.out.println("ID: " + id);
		System.out.println("Employee: " + name);
		System.out.println("Salary: " + monthlySalary);
	}
	public double updateMonthlySalary(double newSalary)
	{
		monthlySalary = newSalary;
		return monthlySalary;
	}
	
}
