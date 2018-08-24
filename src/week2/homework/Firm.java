package week2.homework;

import java.util.ArrayList;

public class Firm {
    private String name;
    private String address;
    private double salaryFund;
    public ArrayList<Employee> employees = new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryFund() {
        return salaryFund;
    }

    public void setSalaryFund(double salaryFund) {
        this.salaryFund = salaryFund;
    }

    public void printAllEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public void giveSalaryForAll() {
        for (int i = 0; i < employees.size(); i++) {
            this.setSalaryFund(this.getSalaryFund()
                    - employees.get(i).getSalaryMonthly());
            employees.get(i).setSalaryAccount(
                    employees.get(i).getSalaryAccount()
                            + employees.get(i).getSalaryMonthly());
        }
    }

    public void calcVocations() {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getMonthsOfWork() >= 6) {
                employees.get(i).setVacationDays(
                        employees.get(i).getVacationDays()
                                + (employees.get(i).getMonthsOfWork() * 2));
            }
        }
    }

}
