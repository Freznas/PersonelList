package com.example.employeelistview;

import java.util.ArrayList;

public class DataManager
//    här skapar vi en "Model" som tar emot och skickar den till "Controller klassen" EmployeeAdapter.
{
    public static ArrayList<Employee> employees = new ArrayList<>();

    public Employee createEmployee(String name, String age, String location, String salary)
    {
        Employee employee = new Employee(name, age, location, salary);
        employees.add(employee);
        return employee;
    }
}