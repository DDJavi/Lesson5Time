package com.example.timeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void time(View v){
        Date d = new Date();
        CharSequence s = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());
        String date ="Date and time\n"+ s.toString();
        TextView currenttime=(TextView) findViewById(R.id.text);
        currenttime.setText(date);

    }

}