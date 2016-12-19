package com.example.alexander.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class DepartmentsActivity extends Activity {

    Button buttonBuildRout, buttonBack;

    String[] names = { "Вино-водочный", "Хлебо-булочный", "Молочный", "Кулинурия", "Мясной", "Бакалея",
            "Овощи-фрукты", "Рыбный", "Кондитерский" };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.my_list_item,
                names);
        lvMain.setAdapter(adapter);
    }
}
