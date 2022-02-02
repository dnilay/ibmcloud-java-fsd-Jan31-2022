package com.example.model;

public class Manager extends Employee {

    private String departmentName;

    public Manager() {
        super();
    }

    public Manager(int employeeId, String employeeName, double salary, String departmentName) {
        super(employeeId, employeeName, salary);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return super.toString()+"department name: "+departmentName;
    }

    public void createManager()
    {

    }
}
