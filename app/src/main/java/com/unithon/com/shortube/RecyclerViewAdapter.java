package com.unithon.com.shortube;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<Items> mItems;
    Context mContext;
    int id;
    public RecyclerViewAdapter(ArrayList itemList,int id){
        mItems = itemList;
        this.id = id;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id,parent,false);
        mContext = parent.getContext();
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.mtitle.setText(mItems.get(position).title);
        holder.mdescribe.setText(mItems.get(position).describe);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
