package com.rusili.a0405recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ColorViewHolder extends RecyclerView.ViewHolder {

    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(String color) {
        TextView colorName = itemView.findViewById(R.id.colorName);
        colorName.setText(color);
    }
}
