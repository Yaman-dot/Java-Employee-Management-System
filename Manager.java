package week10;

public class Manager
{
	private int id;
	private String name;
	private double monthlySalary;
	private int bonus;
	

	public Manager(int id, String name, double monthlySalary, int bonus) {
		super();
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.bonus = bonus;
	}


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


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public double calculateYearlySalary()
	{
		double yearlySalary = monthlySalary*12.0;
		return yearlySalary;
	}
	
}
