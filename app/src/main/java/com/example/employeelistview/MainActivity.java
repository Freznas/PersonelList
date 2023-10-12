package com.example.employeelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

//denna activity är en Controller som sköter kontakten mellan views och models.
//views är samtliga XML layouts och resources
//models är DataManager.java
//controllers är EmployeeAdapter.java och MainActivity.java och Employee_list.java
public class MainActivity extends AppCompatActivity
{
    EditText employeeNameInput;
    EditText employeeAgeInput;
    EditText employeeLocationInput;
    EditText employeeSalaryInput;
    DataManager dataManager = new DataManager();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        hämtar och länkar layout IDn med variabler
        employeeNameInput = findViewById(R.id.et_name);
        employeeAgeInput = findViewById(R.id.et_age);
        employeeLocationInput = findViewById(R.id.et_location);
        employeeSalaryInput = findViewById(R.id.et_salary);
        Button loginButton = findViewById(R.id.btn_view);
        Button registerButton = findViewById(R.id.btn_submit);
//        skapar onclickmetoder för våra knappar på framsidan.
//        den första är för att mata in användarens information till  dataManager
//        den andra är för att skapa en intent att gå till klassen och kolla på listan
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name = employeeNameInput.getText().toString();
                String age = employeeAgeInput.getText().toString();
                String location = employeeLocationInput.getText().toString();
                String salary = employeeSalaryInput.getText().toString();
                if (name.isEmpty() || age.isEmpty() || salary.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Fyll i alla fält", Toast.LENGTH_SHORT).show();
                } else
                {
                    Employee e = dataManager.createEmployee(name, age, location, salary);
                    Toast.makeText(MainActivity.this, "Information submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, Employee_list.class);
                startActivity(intent);
            }
        });
    }
}