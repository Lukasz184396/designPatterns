package com.zawadalukasz.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("123", "John", "Rambo", "john@rambo.com");

        employees.add(employeeFromDB);

        return employees;
    }
}
