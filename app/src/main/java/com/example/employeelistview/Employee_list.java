package com.example.employeelistview;

import android.os.Bundle;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

// här skapar vi en Controller som tar listView och skickar den till DataManagern
public class Employee_list extends AppCompatActivity
{
    ListView employeeList;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        employeeList = findViewById(R.id.lv_employees);
        EmployeeAdapter adapter = new EmployeeAdapter(this, DataManager.employees);
        adapter.notifyDataSetChanged();
        employeeList.setAdapter(adapter);
    }
}