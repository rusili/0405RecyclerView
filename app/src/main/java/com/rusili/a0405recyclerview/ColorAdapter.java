package com.rusili.a0405recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {
    private List<String> colorList;

    public ColorAdapter(List<String> colorList) {
        this.colorList = colorList;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,
                                              int i) {
        View viewHolder = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.color_viewholder, viewGroup, false);
        return new ColorViewHolder(viewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder colorViewHolder,
                                 int i) {
        colorViewHolder.bind(colorList.get(i));
    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }
}
