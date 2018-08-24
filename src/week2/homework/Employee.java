package week2.homework;

public class Employee {
	private String name;
	private String surname;
	private double salaryMonthly;
	private double salaryAccount;
	private int yOfJoining;
	private int mOfJoining;
	private String gender;
	private String department;
	private int vacationDays;
	
	
	public int getMonthsOfWork() {
		int currentYear = 2015;
		int currentMonth = 5;
		return (currentYear - this.yOfJoining) * 12 + (currentMonth - this.mOfJoining);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalaryMonthly() {
		return salaryMonthly;
	}

	public void setSalaryMonthly(double salaryMonthly) {
		this.salaryMonthly = salaryMonthly;
	}

	public double getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(double salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	public int getYOfJoining() {
		return yOfJoining;
	}

	public void setYOfJoining(int yOfJoining) {
		this.yOfJoining = yOfJoining;
	}

	public int getMOfJoining() {
		return mOfJoining;
	}

	public void setMOfJoining(int mOfJoining) {
		this.mOfJoining = mOfJoining;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	
	public Employee(Firm firm) {
		firm.employees.add(this);
	}
}
