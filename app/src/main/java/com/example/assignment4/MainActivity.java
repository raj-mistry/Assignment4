package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<String> itemNames = new ArrayList<>();
    private ArrayList<String> itemDescriptions = new ArrayList<>();
    private ArrayList<String> itemDetails = new ArrayList<>();
    private ArrayList<String> itemImageURLs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}