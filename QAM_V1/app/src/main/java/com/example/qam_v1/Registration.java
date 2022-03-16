package com.example.qam_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        TextView Rname = (TextView) findViewById(R.id.Name);
        TextView RrollNo = (TextView) findViewById(R.id.RollNo);

        Spinner Ryear =  findViewById(R.id.Year);
        ArrayAdapter<CharSequence> adapterYear = ArrayAdapter.createFromResource(this, R.array.Year, android.R.layout.simple_spinner_item);
        adapterYear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Ryear.setAdapter(adapterYear);
        Ryear.setOnItemSelectedListener(this);

        Spinner Rstream =  findViewById(R.id.Stream);
        ArrayAdapter<CharSequence> adapterStream = ArrayAdapter.createFromResource(this, R.array.Stream, android.R.layout.simple_spinner_item);
        adapterStream.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Rstream.setAdapter(adapterStream);
        Rstream.setOnItemSelectedListener(this);


        TextView Remail = (TextView) findViewById(R.id.Email);
        TextView Rusername = (TextView) findViewById(R.id.Username);
        TextView Rpassword = (TextView) findViewById(R.id.Password);
        Button register = (Button)  findViewById(R.id.Register);
        ProgressBar RProgressBar = (ProgressBar) findViewById(R.id.ProgressB);

        fAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Rname.getText().toString().trim();
                String rollNo = RrollNo.getText().toString().trim();
                String Selected_Year = Ryear.getSelectedItem().toString().trim();
                String Stream = Ryear.getSelectedItem().toString().trim();
//                String name = Rname.getText().toString().trim();
//                String name = Rname.getText().toString().trim();

            }
        });






    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String Selected_Year = adapterView.getItemAtPosition(i).toString();
        String Selected_Stream = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}