package com.example.faces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Accueil extends AppCompatActivity {

    public static ArrayList<String> pictures = new ArrayList<String>();

    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        Accueil.pictures.add("1qsdqsdqsd");
        Accueil.pictures.add("2ddddddddddd");
        Accueil.pictures.add("3ffffffffffff");

        MyRecyclerPictureAdapter ad = new MyRecyclerPictureAdapter(Accueil.this, Accueil.pictures);
        rv = findViewById(R.id.rv_affiche);
        rv.setAdapter(ad);
    }
}