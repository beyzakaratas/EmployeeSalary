import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		System.out.print("Your Name? : ");
		String name=scan.nextLine();
		System.out.print("Your Salary?: ");
		double salary=scan.nextDouble();
		System.out.print("Your Work Hours? : ");
		int workHours=scan.nextInt();
		System.out.print("Your Hire Year?: ");
		int hireYear=scan.nextInt();
		
		Employee emp =new Employee(name,salary,workHours,hireYear);
		emp.toString(emp);
		
	}

}
