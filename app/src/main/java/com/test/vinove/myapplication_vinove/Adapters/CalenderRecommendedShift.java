package com.test.vinove.myapplication_vinove.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.vinove.myapplication_vinove.R;

public class CalenderRecommendedShift extends RecyclerView.Adapter<CalenderRecommendedShift.MyViewHolder2> {


    private String[] CalenderList1;
    private String[] CalenderList2;
    private Context context;

    public CalenderRecommendedShift(Context context, String[] CalenderList1, String[] CalenderList2) {
        this.context = context;
        this.CalenderList1 = CalenderList1;
        this.CalenderList2 = CalenderList2;
    }

    @NonNull
    @Override
    public CalenderRecommendedShift.MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calender_row_bottom, parent, false);

        return new MyViewHolder2(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CalenderRecommendedShift.MyViewHolder2 holder, int position) {

        holder.tvCalender1.setText(CalenderList1[position]);
        holder.tvCalender2.setText(CalenderList2[position]);
    }

    @Override
    public int getItemCount() {
        return CalenderList1.length;
    }


    class MyViewHolder2 extends RecyclerView.ViewHolder {

        TextView tvCalender1, tvCalender2;

        MyViewHolder2(View itemView) {
            super(itemView);
            tvCalender1 = itemView.findViewById(R.id.tvCalender1);
            tvCalender2 = itemView.findViewById(R.id.tvCalender2);

        }
    }

}
