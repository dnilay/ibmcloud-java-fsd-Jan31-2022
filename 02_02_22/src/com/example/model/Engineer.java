package com.example.model;

public class Engineer extends Employee{

    private String stream;

    public Engineer() {
        super();
    }

    public Engineer(int employeeId, String employeeName, double salary, String stream) {
        super(employeeId, employeeName, salary);
        this.stream = stream;
    }

    @Override
    public String toString() {
        return super.toString()+" stream is: "+stream;
    }
}
