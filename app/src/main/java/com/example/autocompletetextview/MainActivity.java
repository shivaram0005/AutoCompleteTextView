package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoComplete);
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,names);
        autoCompleteTextView.setAdapter(arrayAdapter);

    }
    String names[]={"RoyalChallengerBangalore","ChennaiSuperKings","MumbaiIndians","KolkataKnightRiders","DelhiCapitals","KingsXIPunjab","SunRisersHyderabad","" +
            "RajasthanRoyals"};
}