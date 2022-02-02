package com.example.model;
// employee class
public class Employee extends Object{
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    // Default
    public Employee() {
    }

    //Parameterized
    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee=null;
        if (obj instanceof Employee)
        {
            employee=(Employee)obj;
        }
        if((this.getEmployeeId()==employee.getEmployeeId()) && (this.getEmployeeName()==employee.getEmployeeName()) && (this.getSalary()==employee.getSalary()))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Employee ID: "+employeeId+" employee name: "+employeeName+" salary: "+salary;
    }
}
