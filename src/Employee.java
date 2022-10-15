
public class Employee {
	String name;
	double salary;
	int workHours,hireYear;
	
	Employee(String name,double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	public double tax() {
		
		if(this.salary>=1000) {
			return this.salary*0.03;
			
			}
		else
			return 0.0;
	}
	public double bonus() {
		
		if(this.workHours>=40) {
			return (this.workHours-40)*30;
			
		}
		return 0.0;
	}
	public double raiseSalary(double tax,double bonus) {
		int year= 2021-this.hireYear;
		double newSalary=this.salary-tax+bonus;
		if(year<10) {
			return newSalary*0.5;
		}
		else if (year>9 && year<20){
			return newSalary*0.10;
		}
		else if (year>19){
			return newSalary*0.15;
		}
		return 0.0;
		
	}
	public void toString(Employee emp) {
		System.out.println("Name: " + emp.name);
		System.out.println("Salary: " + emp.salary);
		System.out.println("Work Hours: " + emp.workHours);
		System.out.println("Hire Year: " + emp.hireYear);
		System.out.println("Tax: " + emp.tax());
		System.out.println("Bonus: "+ emp.bonus());
		System.out.println("Raise Salary: " + emp.raiseSalary(emp.tax(), emp.bonus()));
		System.out.println("Salary with bonus and tax: " + (emp.salary-emp.tax()+emp.bonus()));
		System.out.println("Total Salary (bonus,tax and raise salary): " + (emp.salary-emp.tax()+emp.bonus()+emp.raiseSalary(emp.tax(), emp.bonus())));
		
		
	}
	

}
