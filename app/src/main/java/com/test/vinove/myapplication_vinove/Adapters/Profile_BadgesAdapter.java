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

public class Profile_BadgesAdapter extends RecyclerView.Adapter<Profile_BadgesAdapter.MyViewHolder> {
    private String[] ProfileList;
    private Context context;
    private int[] ProfileImageArr;

    public Profile_BadgesAdapter(Context context, String[] ProfileList, int[] ProfileImageArr) {
        this.context = context;
        this.ProfileList = ProfileList;
        this.ProfileImageArr = ProfileImageArr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calender_badges_row, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.tvProfile.setText(ProfileList[position]);
        holder.ivProfile.setImageResource(ProfileImageArr[position]);

    }

    @Override
    public int getItemCount() {
        return ProfileList.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivProfile;
        TextView tvProfile;

        MyViewHolder(View itemView) {
            super(itemView);
            tvProfile = itemView.findViewById(R.id.tvProfile);
            ivProfile = itemView.findViewById(R.id.ivProfile);

        }
    }
}
