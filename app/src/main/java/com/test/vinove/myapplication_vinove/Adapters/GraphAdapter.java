package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class GraphAdapter extends RecyclerView.Adapter<GraphAdapter.MyViewHolder> {

    private String[] GraphList;
    private Context context;

    public GraphAdapter(Context context, String[] GraphList) {
        this.context = context;
        this.GraphList = GraphList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.graph_row, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.tvGraph1.setText(GraphList[position]);
        holder.tvGraph2.setText(GraphList[position]);
        holder.btnGraph.setText(""+GraphList[position]);


    }

    @Override
    public int getItemCount() {

        return GraphList.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {


        TextView tvGraph1;
        TextView tvGraph2;
        TextView btnGraph;

        MyViewHolder(View itemView) {
            super(itemView);
            btnGraph = itemView.findViewById(R.id.btnGraph);
            tvGraph1 = itemView.findViewById(R.id.tvGraph1);
            tvGraph2 = itemView.findViewById(R.id.tvGraph2);

        }
    }
}
