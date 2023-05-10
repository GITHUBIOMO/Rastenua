package com.example.mashuna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BuoAdapter extends RecyclerView.Adapter<BuoAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Buo> buos;
    public BuoAdapter(Context context, List<Buo> buos) {
        this.inflater = LayoutInflater.from(context);
        this.buos = buos;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Buo buo = buos.get(position);
        holder.buoView.setImageResource(buo.getBuoResource());
        holder.nameView.setText(buo.getName());
        holder.buoDescriptionView.setText(buo.getBuoDescription());
        holder.populationSizeView.setText(buo.getPopulationSize());
    }
    @Override
    public int getItemCount() {
        return buos.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView buoView;
        final TextView nameView, buoDescriptionView, populationSizeView;
        ViewHolder(View view) {
            super(view);
            buoView = view.findViewById(R.id.buoResource);
            nameView = view.findViewById(R.id.name);
            buoDescriptionView = view.findViewById(R.id.buoDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}
