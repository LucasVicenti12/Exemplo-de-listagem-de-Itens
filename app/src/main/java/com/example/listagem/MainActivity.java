package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] itens;
    ArrayAdapter arrayAdapter;
    ListView listadeitens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itens = new String[]{
            "Cafe",
            "Programacao",
            "Gatos",
            "Desenhar",
            "Desafios"
        };
        listadeitens = findViewById(R.id.listagemdeitens);
        arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.item_lista, R.id.textView2, itens);
        listadeitens.setAdapter(arrayAdapter);
    }
}