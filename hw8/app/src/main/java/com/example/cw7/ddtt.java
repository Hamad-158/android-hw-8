package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ddtt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddtt);


        Bundle v = getIntent().getExtras();
        pokemon mm = (pokemon) v.getSerializable("pat");

        TextView name = findViewById(R.id.textView4);
        TextView attack = findViewById(R.id.textView5);
        TextView def = findViewById(R.id.textView6);
        TextView tt = findViewById(R.id.textView7);
        ImageView mmm = findViewById(R.id.imageView3);

        name.setText(mm.getName());
        attack.setText(mm.getAttack()+"");
        def.setText(mm.getDefence()+"");
        tt.setText(mm.getTotal()+"");
        mmm.setImageResource(mm.getImage());


    }
}