package entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	
	private String name;
	private WorkLevel level;
	private double baseSalary;
	
	private Department department;
	private  List<HourContract> contracts = new ArrayList<>();
	
	public Worker (String name, WorkLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return this.name;
	}
	public WorkLevel getLevel() {
		return this.level;
	}
	public double getBaseSalary() {
		return this.baseSalary;
	}
	public String getDepartment () {
		return department.getName();
	}
	public void setDepartment (String department) {
		this.department.setName(department);
	}
	public void setName ( String name) {
		this.name = name;
	}
	public void setLevel( WorkLevel level) {
		this.level = level;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	public double income(int year, int month) {
		 double sum = this.baseSalary;
		 Calendar cal = Calendar.getInstance();
		 
		 for (HourContract c : contracts) {
			 int cYear= cal.get(Calendar.YEAR);
			 int cMonth = 1 + cal.get(Calendar.MONTH); // +1 pois o mes do calendar começa em 0
			 
			 if(cYear == year && cMonth == month) {
				sum = sum + c.getValuePerHour();
			 }
		 }
		 return sum;
	}
	
	
	public String toString() {
		return "Name:" + this.name + 
			   " ;Level:" + this.level +
			   " ;Salary:" + this.baseSalary;
	}
}
