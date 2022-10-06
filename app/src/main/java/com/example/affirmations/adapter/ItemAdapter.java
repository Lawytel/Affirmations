package com.example.affirmations.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    List<Affirmation> dataset;
    Context context;

    public ItemAdapter(Context context, List<Affirmation> dataset) {
        this.dataset = dataset;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Affirmation item = this.dataset.get(position);
        String str = this.context.getResources().getString(item.getStringResourceId());
        holder.textView.setText(str);
        holder.imageView.setImageResource(item.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return this.dataset.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public ItemViewHolder(@NonNull View view) {
            super(view);
            textView = view.findViewById(R.id.item_title);
            imageView = view.findViewById(R.id.item_image);
        }
    }
}
