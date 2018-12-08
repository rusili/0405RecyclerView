package com.rusili.a0405recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> colorList = new ArrayList<>((Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink", "Orange", "Violet", "Black", "White", "Magenta", "Blurple")));

        RecyclerView colorRecyclerView = findViewById(R.id.colorRecyclerView);
        colorRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        colorRecyclerView.setAdapter(new ColorAdapter(colorList));
    }
}
