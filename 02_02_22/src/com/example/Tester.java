package com.example;

import com.example.model.Adition;
import com.example.model.Employee;

public class Tester extends Object{



    public static void main(String[] args) {
      /*  Adition adition=new Adition();
        System.out.println(adition.add());
        System.out.println(adition.add(10,20));
        System.out.println(adition.add(10,200.90));
        System.out.println(adition.addMe());
        System.out.println(adition.addMe(10,20,30,40,50));*/

        Employee employee=new Employee(100,"John",1000);
        Employee employee1=new Employee(100,"John",1000);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee==employee1);
        System.out.println(employee.equals(employee1));

    }
}
