package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class CalenderAdapter extends RecyclerView.Adapter<CalenderAdapter.MyViewHolder> {


    private String[] CalenderListArr;
    private Context context;

    public CalenderAdapter(Context context, String[] list) {
        this.context = context;
        this.CalenderListArr = list;
    }

    @NonNull
    @Override
    public CalenderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calender_row_top, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CalenderAdapter.MyViewHolder holder, int position) {

        holder.tvCalender.setText(CalenderListArr[position]);
    }

    @Override
    public int getItemCount() {
        return CalenderListArr.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvCalender;

        MyViewHolder(View itemView) {
            super(itemView);
            tvCalender = itemView.findViewById(R.id.tvCalender);

        }
    }

}