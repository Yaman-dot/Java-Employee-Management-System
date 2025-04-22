package week10;

public class RegularEmployee 
{
	private int id;
	private String name;
	private double monthlySalary;
	private int vacationDays;
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
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getVacationDays() {
		return vacationDays;
	}
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	public RegularEmployee(int id, String name, double monthlySalary, int vacationDays) {
		super();
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.vacationDays = vacationDays;
	}
	
	public double calculateYearlySalary()
	{
		monthlySalary*=12.0;
		return monthlySalary;
	}
	
	public int takeVacation(int days)
	{
		vacationDays -=days;
		return vacationDays;
	}
	void DisplayInfo()
	{
		System.out.println("ID: " + id);
		System.out.println("Employee: " + name);
		System.out.println("Salary: " + monthlySalary);
		System.out.println("Remaining Vacation Days: " + vacationDays);
	}
}
