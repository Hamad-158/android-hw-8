package com.example.cw7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<pokemon>pokemons = new ArrayList<>();
        pokemon a1 = new pokemon("B" ,R.drawable.bulbasaur , 45 ,49,302 );
        pokemon a2 = new pokemon("a" ,R.drawable.images , 40 ,42,392 );
        pokemon a3 = new pokemon("c" ,R.drawable.download , 48 ,45,332 );
        pokemon a4 = new pokemon("n" ,R.drawable.ttt , 46 ,65,312 );

        pokemons.add(a1);
        pokemons.add(a2);
        pokemons.add(a3);
        pokemons.add(a4);


        RecyclerView pr = findViewById(R.id.rarar);
        pr.setHasFixedSize(true);
        RecyclerView.LayoutManager nn = new LinearLayoutManager(this);
        pr.setLayoutManager(nn);

        PAdapter adapter = new PAdapter(pokemons);
        pr.setAdapter(adapter);
    }
}



