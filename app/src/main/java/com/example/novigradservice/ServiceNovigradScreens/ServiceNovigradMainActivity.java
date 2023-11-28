package com.example.novigradservice.ServiceNovigradScreens;

import static com.example.novigradservice.Utils.Constant.setAdminLoginStatus;
import static com.example.novigradservice.Utils.Constant.setCustomerLoginStatus;
import static com.example.novigradservice.Utils.Constant.setServiceLoginStatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.novigradservice.R;
import com.example.novigradservice.Screens.AccountActivity;
import com.example.novigradservice.Utils.Constant;

public class ServiceNovigradMainActivity extends AppCompatActivity {
         TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_novigrad_main);
        textView = findViewById(R.id.textView);
        textView.setText("Welcome " + Constant.getUsername(this) + " ! You are logged in as a ServiceNovigrad");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemId = item.getItemId();
        if (menuItemId == R.id.logout) {
            setAdminLoginStatus(ServiceNovigradMainActivity.this,false);
            setCustomerLoginStatus(ServiceNovigradMainActivity.this,false);
            setServiceLoginStatus(ServiceNovigradMainActivity.this,false);
            startActivity(new Intent(ServiceNovigradMainActivity.this, AccountActivity.class));
            finish();
        } else {
            return super.onOptionsItemSelected(item);
        }


        return super.onOptionsItemSelected(item);
    }
}