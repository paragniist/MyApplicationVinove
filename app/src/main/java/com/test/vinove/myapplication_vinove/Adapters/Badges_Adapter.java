package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class Badges_Adapter extends RecyclerView.Adapter<Badges_Adapter.MyViewHolder> {
    private String[] badgesList;
    private Context context;
    private int[] badgesImageArr;

    public Badges_Adapter(Context context, String[] badgesList, int[] badgesImageArr) {
        this.context = context;
        this.badgesList = badgesList;
        this.badgesImageArr = badgesImageArr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.badges_row, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.tvBadges.setText(badgesList[position]);
        holder.ivBadges.setImageResource(badgesImageArr[position]);

    }

    @Override
    public int getItemCount() {

        return badgesList.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivBadges;
        TextView tvBadges;

        MyViewHolder(View itemView) {
            super(itemView);
            tvBadges = itemView.findViewById(R.id.tvBadges);
            ivBadges = itemView.findViewById(R.id.ivBadges);

        }
    }
}
