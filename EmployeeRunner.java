package com.trimindtech.training.day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to employee registration");
        int num = 1;
        ArrayList<Employee> employees = new ArrayList<Employee>();


        Employee employee1 = new Employee("ammu",1001,10000);
        Employee employee2 = new Employee("mahek",1002,15000);
        Employee employee3 = new Employee("tanna",1003,20000);
        Employee employee4 = new Employee("tanna",1003,20000);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("no of employees"+ employees.size());
        for (Employee employee : employees){
            System.out.println(employee.toString());
        }
        System.out.println(employees.contains(employee4));
        Set<Employee> employeeSet = new HashSet<Employee>();
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
