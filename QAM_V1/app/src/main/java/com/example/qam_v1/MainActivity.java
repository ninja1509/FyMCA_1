package com.example.qam_v1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username =(TextView) findViewById(R.id.Username);
        TextView password =(TextView) findViewById(R.id.password);

        Button loginBtn = (Button) findViewById(R.id.Login);







    }
}
