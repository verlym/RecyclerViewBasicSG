package com.idev.verly.recyclerviewbasic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ItemHolder> {

    LinkedList<Model> strings = new LinkedList<>();

    public WordListAdapter(LinkedList<Model> string){
        this.strings = string;
    }

    public class ItemHolder extends RecyclerView.ViewHolder {

        TextView tvList;

        public ItemHolder(View itemView) {
            super(itemView);
            tvList = itemView.findViewById(R.id.tvList);
        }
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list,parent,false);
        return new ItemHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.tvList.setText(strings.get(position).getKelas());
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

}