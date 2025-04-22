package week10;

public class CompanyManager {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1641, "Yuman Bashar", 12000);
		RegularEmployee re1 = new RegularEmployee(16312, "Ahmad Mohammad", 10000.0, 100);
		
		
		
		
		Manager m1 = new Manager(00000, "Ahmad Alqam", 1000000, 90000);
		
		
		
		
		
		
		
		HourlyWorker hw1 = new HourlyWorker(97611, "Kareem Al Azzah", 100, 1239);
		
		System.out.println("Yearly Salary: " + e1.calculateYearlySalary());
		System.out.println("Monthly Salary: " + e1.getMonthlySalary());
		
		
		
		
		
		
		e1.setMonthlySalary(1000000.0);
		
		System.out.println(e1.getMonthlySalary());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Monthly Salary: " + e1.getMonthlySalary());
		System.out.println();
		e1.DisplayInfo();
		
		System.out.println();
		System.out.println("Yearly Salary: " + re1.calculateYearlySalary());
		System.out.println("Monthly Salary: " + re1.getMonthlySalary());
		re1.setMonthlySalary(1000.0);
		System.out.println("Monthly Salary: " + re1.getMonthlySalary());
		re1.setVacationDays(90);
		System.out.println("Vacation Days: " + re1.getVacationDays());
		System.out.println();
		re1.takeVacation(12);
		re1.DisplayInfo();
		
		System.out.println();
		
		System.out.println("Yearly Salary: " + m1.calculateYearlySalary());
		System.out.println();
		
		System.out.println("Yearly Salary" + hw1.calculateYearlySalary());*/
		
		
		
	}

}
