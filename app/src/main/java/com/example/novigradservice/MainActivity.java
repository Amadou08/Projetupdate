package com.example.novigradservice;

import static com.example.novigradservice.Utils.Constant.setAdminLoginStatus;
import static com.example.novigradservice.Utils.Constant.setCustomerLoginStatus;
import static com.example.novigradservice.Utils.Constant.setServiceLoginStatus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.novigradservice.Model.Services;
import com.example.novigradservice.Screens.AccountActivity;
import com.example.novigradservice.Utils.Constant;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView.setText("Welcome "+ Constant.getUsername(this)+" ! You are logged in as a Customer");

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemId = item.getItemId();
        if (menuItemId == R.id.logout) {
            setAdminLoginStatus(MainActivity.this,false);
            setCustomerLoginStatus(MainActivity.this,false);
            setServiceLoginStatus(MainActivity.this,false);
            startActivity(new Intent(MainActivity.this, AccountActivity.class));
            finish();
        } else {
            return super.onOptionsItemSelected(item);
        }


        return super.onOptionsItemSelected(item);
    }

}