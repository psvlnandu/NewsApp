package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.models.NewsHeadline;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    //obj taht well pass for custom aadapter
    private Context context;
    private List<NewsHeadline> headlines;


    public CustomAdapter(Context context, List<NewsHeadline> headlines) {
        this.context = context;
        this.headlines = headlines;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        //add objs of new headline
        holder.title_tv.setText(headlines.get(position).getTitle());
        holder.source_tv.setText(headlines.get(position).getSource().getName());
        //to show image
        if(headlines.get(position).getUrlToImage()!=null){
            Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.img_headline);
        }

    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
