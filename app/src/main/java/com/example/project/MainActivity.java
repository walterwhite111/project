package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] namesArr = new String[]{"Attack on Titan", "One Piece", "My Hero Academia",
            "Tokyo Ghoul", "Dr. Stone", "Cowboy Bebop", "One Punch Man", "Naruto", "Demon Slayer: Kimetsu no Yaiba",
            "Code Geass", "JoJo's Bizarre Adventure", "Black Lagoon", "Vinland Saga", "Bleach",
            "Great Teacher Onizuka", "A Silent Voice (Koe no Katachi)"};
    private ListView namesView;
    private TextView animeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animeText = findViewById(R.id.animeText);
        namesView = findViewById(R.id.namesView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namesArr);
        namesView.setAdapter(adapter);
    }
}