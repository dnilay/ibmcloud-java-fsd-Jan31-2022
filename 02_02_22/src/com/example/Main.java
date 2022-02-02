package com.example;

import com.example.model.Employee;
import com.example.model.Engineer;
import com.example.model.Manager;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //polymorphic argument
    public void display(Employee employee) {
        Employee tempEmployee = null;
        if (employee instanceof Manager) {
            tempEmployee = (Manager) employee;
            System.out.println("Type Of Employee Is Manager: " + tempEmployee.displayDetails());
        } else if (employee instanceof Engineer) {
            tempEmployee = (Engineer) employee;
            System.out.println("Type of employee is Engineer: " + tempEmployee.displayDetails());
        } else if (employee instanceof Employee) {
            tempEmployee = employee;
            System.out.println(tempEmployee.displayDetails());
        }

    }



    public static void main(String[] args) {
	/*// write your code here
        Scanner scanner=new Scanner(System.in);
        int choice =0;
        Employee[] employees=null;
        String name=null;
        double salary=0.0D;
        System.out.print("How Many Employees Want to Store?  ");
        int capacity=scanner.nextInt();
        employees=new Employee[capacity];
        do {
            System.out.println("1. Create Employees..");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search An Employee By Id: ");
            System.out.println("4. Update Employee By Id: ");
            System.out.println("0: Exit");
            System.out.print("Enter Your Choice: ");
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1:
                    for(int i=0;i< employees.length;i++)
                    {
                        System.out.print("Enter Employee Name: ");
                        name= scanner.next();
                        System.out.print("Enter Salary: ");
                        salary=scanner.nextDouble();
                        employees[i]=new Employee(new Random().nextInt(1000),name,salary);
                        System.out.println(i+1+" employee(s) created successfully");
                    }
                    System.out.println("Employees Array Is Ready...");
                    break;
                case 2:
                    for(Employee e:employees)
                    {
                        System.out.println(e.getEmployee());
                    }
                    break;
                case 3:
                    boolean flag=false;
                    System.out.print("Enter ID: ");
                    int id=scanner.nextInt();
                    //label
                    outer:
                    for(int i=0;i<employees.length;i++)
                    {

                            if(employees[i].getEmployeeId()==id)
                            {
                                System.out.println("Employee Found with details: "+employees[i].getEmployee());
                                flag=true;
                                break outer;
                            }


                    }
                    if (!flag)
                    {
                        System.out.println("not found");
                    }
                    break;
                case 4:
                     flag=false;
                    System.out.print("Enter ID: ");
                     id=scanner.nextInt();
                    //label
                    outer:
                    for(int i=0;i<employees.length;i++)
                    {

                        if(employees[i].getEmployeeId()==id)
                        {
                            System.out.println("Employee Found with Updating ");
                            System.out.print("Enter Updated Employee Name: ");
                            name= scanner.next();
                            System.out.print("Enter Updated Salary: ");
                            salary=scanner.nextDouble();
                            employees[i].setEmployeeName(name);
                            employees[i].setSalary(salary);
                            System.out.println("Updated Successfully:\n"+employees[i].getEmployee());
                            flag=true;
                            break outer;
                        }


                    }
                    if (!flag)
                    {
                        System.out.println("not found");
                    }
                    break;

                case 0:
                    System.out.println("Bye......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }


        }while (choice!=0);
*/
        //dynamic method dispatching
        //polyporphism
       /* Employee employee=new Manager(new Random().nextInt(1000),"John",20000,"Account");
        //display the details of manager
        System.out.println(employee.displayDetails());
        //createManager is not available on Employee class
        //employee.createManager();
        employee=new Engineer(new Random().nextInt(1000),"Marry",21000,"Computer Science");
       // System.out.println(employee.displayDetails());
        employee=new Employee(new Random().nextInt(1000),"sachin",67000);
        System.out.println(employee.displayDetails());*/

        Employee[] employees = new Employee[5];
        //heterogeneous collection
        employees[0] = new Employee(new Random().nextInt(1000), "John", 10000);
        employees[1] = new Manager(new Random().nextInt(1000), "Marry", 20000, "CA");
        employees[2] = new Engineer(new Random().nextInt(1000), "David", 20000, "CSC");
        employees[3] = new Manager(new Random().nextInt(1000), "Marry1", 20010, "AA");
        employees[4] = new Engineer(new Random().nextInt(1000), "David1", 20020, "CSC223");
        Employee tempEmployee = null;
        for (Employee employee : employees) {

            if (employee instanceof Manager) {
                tempEmployee = (Manager) employee;
                System.out.println("Type Of Employee Is Manager: " + tempEmployee.displayDetails());
            } else if (employee instanceof Engineer) {
                tempEmployee = (Engineer) employee;
                System.out.println("Type of employee is Engineer: " + tempEmployee.displayDetails());
            } else if (employee instanceof Employee) {
                tempEmployee = employee;
                System.out.println(tempEmployee.displayDetails());
            }

            Main main=new Main();
            main.display(new Employee());
            main.display(new Manager());
            main.display(new Engineer());
        }


    }



}

