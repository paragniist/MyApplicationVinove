package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;


public class BroadcastAdapter extends RecyclerView.Adapter<BroadcastAdapter.MyViewHolder> {

    //private ArrayList<MyModel> list;
    private String[] broadcastListArr;
    private String[] broadcastListArr1;
    private Context context;

    public BroadcastAdapter(Context context, String[] broadcastListArr, String[] broadcastListArr1) {
        this.context = context;
        this.broadcastListArr = broadcastListArr;
        this.broadcastListArr1 = broadcastListArr1;
    }

    @Override
    public BroadcastAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.broadcast_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BroadcastAdapter.MyViewHolder holder, int position) {

        holder.tvBroadcast1.setText(broadcastListArr[position]);
        holder.tvBroadcast2.setText(broadcastListArr1[position]);
    }

    @Override
    public int getItemCount() {
        return broadcastListArr.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivBroadcast;
        TextView tvBroadcast1, tvBroadcast2, tvBroadcast3;

        MyViewHolder(View itemView) {
            super(itemView);
            tvBroadcast1 = itemView.findViewById(R.id.tvBroadcast1);
            tvBroadcast2 = itemView.findViewById(R.id.tvBroadcast2);
            tvBroadcast3 = itemView.findViewById(R.id.tvBroadcast3);
            ivBroadcast = itemView.findViewById(R.id.ivBroadcast);

        }
    }


}