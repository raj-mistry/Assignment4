package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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
        InitImageBitmaps();
    }

    private void InitImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        itemImageURLs.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        itemNames.add("Havasu Falls");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        itemImageURLs.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        itemNames.add("Trondheim");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        itemImageURLs.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        itemNames.add("Portugal");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        itemImageURLs.add("https://i.redd.it/j6myfqglup501.jpg");
        itemNames.add("Rocky Mountain National Park");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");


        itemImageURLs.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        itemNames.add("Mahahual");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        itemImageURLs.add("https://i.redd.it/k98uzl68eh501.jpg");
        itemNames.add("Frozen Lake");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");


        itemImageURLs.add("https://i.redd.it/glin0nwndo501.jpg");
        itemNames.add("White Sands Desert");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        itemImageURLs.add("https://i.redd.it/obx4zydshg601.jpg");
        itemNames.add("Austrailia");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        itemImageURLs.add("https://i.imgur.com/ZcLLrkY.jpg");
        itemNames.add("Washington");
        itemDescriptions.add("This is a long ass description");
        itemDetails.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.mainRecyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, itemNames, itemImageURLs, itemDescriptions, itemDetails);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}