package com.example.cw7;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw7.R;

import java.util.ArrayList;

public class PAdapter extends RecyclerView.Adapter {
    ArrayList<pokemon> pArry;

    Context c;

    public PAdapter(ArrayList<pokemon> pArry) {
        this.pArry = pArry;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.iii, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(pArry.get(position).getImage());
        ((ViewHolder) holder).pokemonName.setText(pArry.get(position).getImage());
        ((ViewHolder) holder).pokemonTotal.setText(pArry.get(position).getTotal() + "");
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c, ddtt.class);
                intent.putExtra("pat", pArry.get(position));
                c.startActivity(intent);
            }
        });
        ((ViewHolder) holder).delea.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View view) {
                pArry.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pArry.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView delea;
        public ImageView img;
        public TextView pokemonName;
        public TextView pokemonTotal;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            pokemonName = itemView.findViewById(R.id.textView);
            pokemonTotal = itemView.findViewById(R.id.textView3);
            img = itemView.findViewById(R.id.hhhggg);
            delea = itemView.findViewById(R.id.iimm);
        }
    }
}