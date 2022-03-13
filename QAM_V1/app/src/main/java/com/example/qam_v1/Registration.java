package com.example.qam_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        TextView name = (TextView) findViewById(R.id.Name);
        TextView rollNo = (TextView) findViewById(R.id.RollNo);
        TextView year = (TextView) findViewById(R.id.Year);
        TextView stream = (TextView) findViewById(R.id.Stream);
        TextView email = (TextView) findViewById(R.id.Email);
        TextView username = (TextView) findViewById(R.id.Username);
        TextView password = (TextView) findViewById(R.id.Password);
        Button register = (Button)  findViewById(R.id.Register);




    }
}
