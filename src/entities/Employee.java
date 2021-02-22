package entities;

public class Employee {
	private String name;
	private Integer id;
	private Double salary;
	public double grossSalary;
	public double tax;

	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		
		return id + ", " + name + String.format(", $ %.2f", salary);
	}
	
}
