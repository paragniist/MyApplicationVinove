package com.test.vinove.myapplication_vinove.Activities;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test.vinove.myapplication_vinove.Adapters.CalenderAdapter;
import com.test.vinove.myapplication_vinove.Adapters.CalenderRecommendedShift;
import com.test.vinove.myapplication_vinove.R;

public class CalenderActivity extends AppCompatActivity {

    String[] CalenderListArr = {"January 7-13", "January 14-20", "January 21-27", "January 21-27", "January 21-27"};
    String[] CalenderListArr1 = {"Tomorrow", "Wednesday", "Thursday"};
    String[] CalenderListArr2 = {"3pm - 6pm", "11am - 5pm", "1pm - 5pm"};
    AppCompatButton calender_setPrefBtn;
    Context context;
    RecyclerView calenderRecyclerViewBottom, calenderRecyclerViewTop;
    LinearLayoutManager calenderLinearLayoutManager, calenderLinearLayoutManagerBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        context = CalenderActivity.this;

        calenderRecyclerViewBottom = findViewById(R.id.calenderRecyclerViewBottom);
        calenderRecyclerViewTop = findViewById(R.id.calenderRecyclerViewTop);
        calender_setPrefBtn = findViewById(R.id.calender_setPrefBtn);


        calenderLinearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        calenderRecyclerViewTop.setLayoutManager(calenderLinearLayoutManager);
        CalenderAdapter calenderAdapter = new CalenderAdapter(context, CalenderListArr);
        calenderRecyclerViewTop.setAdapter(calenderAdapter);


        calenderLinearLayoutManagerBottom = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        calenderRecyclerViewBottom.setLayoutManager(calenderLinearLayoutManagerBottom);

        CalenderRecommendedShift recommendedShiftAdapter = new CalenderRecommendedShift(context, CalenderListArr1, CalenderListArr2);
        calenderRecyclerViewBottom.setAdapter(recommendedShiftAdapter);


        calender_setPrefBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setComponent(new ComponentName(context, DialogActivity.class));
                startActivity(i);
            }
        });


    }

}
