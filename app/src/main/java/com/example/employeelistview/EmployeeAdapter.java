package com.example.employeelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class EmployeeAdapter extends ArrayAdapter<Employee>
//    här är våran custom adapter "Controller" som ska tar information från "View klassen" listview_employees och skickar till "Model klassen" DataManager för lagring,
//    Samt hämtar från "Model klassen" DataManager och skickar tillbaka till "View klassen" activity_employee.
{
    public EmployeeAdapter(Context context, List<Employee> employees)
    {
        super(context, 0, employees);
    }

    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview_employees, parent, false);
        }
        Employee currentEmployee = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.tv_information);
        TextView ageTextView = listItemView.findViewById(R.id.tv_information2);
        TextView locationView = listItemView.findViewById(R.id.tv_information3);
        TextView salaryView = listItemView.findViewById(R.id.tv_information4);
        nameTextView.setText(currentEmployee.getEmployee());
        ageTextView.setText(currentEmployee.getAge());
        locationView.setText(currentEmployee.getLocation());
        salaryView.setText(currentEmployee.getSalary());
        return listItemView;
    }
}