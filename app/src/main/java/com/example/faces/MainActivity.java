package com.example.faces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednom, edmp;
    Button btn_valider, btn_quitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // recuperation des composants
        ednom = findViewById(R.id.ednom_auth);
        edmp = findViewById(R.id.edmdp_auth);
        btn_valider = findViewById(R.id.btn_valider_auth);
        btn_quitter = findViewById(R.id.btn_quitter_auth);


        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = ednom.getText().toString();
                String mdp = edmp.getText().toString();
                if(nom.equalsIgnoreCase("A") && mdp.equals("A")){
                    Intent i = new Intent(MainActivity.this, Accueil.class);
                    i.putExtra("USER", nom);
                    Toast.makeText(MainActivity.this, "Authentification réussie!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this, "Informations erronées", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}