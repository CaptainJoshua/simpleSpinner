package com.example.garcia_myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerFavorites;
    TextView textViewFavorites;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerFavorites = findViewById(R.id.spinnerFavorites);
        textViewFavorites = findViewById(R.id.textViewFavorites);
        adapter = ArrayAdapter.createFromResource(this, R.array.favorites, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerFavorites.setAdapter(adapter);

        spinnerFavorites.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    textViewFavorites.setText(parent.getItemAtPosition(position).toString() + ":\t \t \t \t Kare-Kare");
                } else if (position == 1) {
                    textViewFavorites.setText(parent.getItemAtPosition(position).toString() + ":\t \t \t \t Cebu");
                } else if (position == 2) {
                    textViewFavorites.setText(parent.getItemAtPosition(position).toString() + ":\t \t \t \t Star Trek");
                } else if (position == 3) {
                    textViewFavorites.setText(parent.getItemAtPosition(position).toString() + ":\t \t \t \t Bruno Mars");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}