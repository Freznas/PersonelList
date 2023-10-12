package com.example.employeelistview;

//controller som hämtar data från model DataManager.java och skickar till EmployeeAdapter.java som i sin tur skickar det till View listview_employees.xml
public class Employee
{
    String employee;
    String age;
    String location;
    String salary;

    public Employee(String employee, String age, String location, String salary)
    {
        this.employee = employee;
        this.age = age;
        this.location = location;
        this.salary = salary;
    }

    public String getEmployee()
    {
        return employee;
    }

    public void setEmployee(String employee)
    {
        this.employee = employee;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getSalary()
    {
        return salary;
    }

    public void setSalary(String salary)
    {
        this.salary = salary;
    }
}