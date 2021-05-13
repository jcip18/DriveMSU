package com.example.drivemsu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.content.Intent;

import android.net.Uri;

import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//This is going to be the navigation button for the app
    //Once you click on it then it will direct you
    private Button navBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// This is going to be named navbtn
        //Will be set on click
        navBtn = findViewById(R.id.navBtn);

        navBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
//This is what is going to make the navigation go to montclair
        //Once the navigation is open then it will direct you
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
// This is required for google maps to open
        mapIntent.setPackage("com.google.android.apps.maps");

        startActivity(mapIntent);

    }

}