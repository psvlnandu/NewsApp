package com.example.newsapp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    //creating obj for view items atht we created for headline item
    //we had 2 txt view n one imgview
    TextView title_tv,source_tv;
    ImageView img_headline;
    CardView cardview;
    public CustomViewHolder(@NonNull View context) {
        super(context);

        title_tv=context.findViewById(R.id.tv_title);
        source_tv=context.findViewById(R.id.tv_source);
        img_headline=context.findViewById(R.id.img_headline);
        cardview=context.findViewById(R.id.main_container);
    }
}
