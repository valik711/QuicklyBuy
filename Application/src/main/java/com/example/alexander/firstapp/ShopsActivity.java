package com.example.alexander.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;


public class ShopsActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    Button buttonChoose, buttonBack;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        buttonChoose = (Button) findViewById(R.id.buttonChoose);
        buttonChoose.setOnClickListener(this);

        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this);

        tabHost.setup();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("АЛМИ");
        tabSpec.setContent(R.id.lnShop);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("ГИППО");
        tabSpec.setContent(R.id.lnShop2);
        tabHost.addTab(tabSpec);


        tabSpec = tabHost.newTabSpec("tag3");
        tabSpec.setIndicator("Корона");
        tabSpec.setContent(R.id.lnShop3);
        tabHost.addTab(tabSpec);


        tabHost.setCurrentTabByTag("tag1");

        // обработчик переключения вкладок
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            public void onTabChanged(String tabId) {
                Toast.makeText(getBaseContext(), "tabId = " + tabId, Toast.LENGTH_SHORT).show();
            }
        });
    }


    Intent intent;
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonChoose:
                 intent = new Intent(this, DepartmentsActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonBack:
                 intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}


