package com.example.lastproject;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.text.BreakIterator;
import java.util.ArrayList;

public class ListMasjidAdapter extends RecyclerView.Adapter<ListMasjidAdapter.ListViewHolder> {
    private ArrayList<Masjid> listMasjid;

    public ListMasjidAdapter(ArrayList<Masjid>list) {
     this.listMasjid = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_masjid, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Masjid masjid = listMasjid.get(position);
        Glide.with(holder.itemView.getContext())
                .load(masjid.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(masjid.getName());
        holder.tvDetail.setText(masjid.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(view.getContext(), DetailActivity.class);
                moveIntent.putExtra("objek",listMasjid.get(position));
                view.getContext().startActivity(moveIntent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listMasjid.size();
    }

     class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

         ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}
