package week10;

public class HourlyWorker 
{
	private int id;
	private String name;
	private double monthlySalary;
	private int hoursWorked;
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
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public HourlyWorker(int id, String name, double monthlySalary, int hoursWorked) {
		super();
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.hoursWorked = hoursWorked;
	}
	
	public double calculateYearlySalary()
	{
		double yearlySalary = monthlySalary*12.0;
		return yearlySalary;
	}
}
