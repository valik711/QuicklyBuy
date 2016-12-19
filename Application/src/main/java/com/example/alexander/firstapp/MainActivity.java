package com.example.alexander.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonNewRout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNewRout = (Button) findViewById(R.id.buttonNewRout);
        buttonNewRout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonNewRout:
                Intent intent = new Intent(this, ShopsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
