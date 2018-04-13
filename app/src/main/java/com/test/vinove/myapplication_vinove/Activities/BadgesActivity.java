package com.test.vinove.myapplication_vinove.Activities;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.vinove.myapplication_vinove.Adapters.Badges_Adapter;
import com.test.vinove.myapplication_vinove.R;

public class BadgesActivity extends AppCompatActivity {

    GridLayoutManager badgesGridLayoutManager;
    RecyclerView badgesRecyclerView;
    Badges_Adapter badgesAdapter;
    private Context mContext;
    private String[] BadgesListArr = {"Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap"};
    private int[] BadgesImageArr = {R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);
        badgesRecyclerView = findViewById(R.id.badgesRecyclerView);
        mContext = BadgesActivity.this;


        badgesGridLayoutManager = new GridLayoutManager(mContext, 2);
        badgesRecyclerView.setHasFixedSize(true);
        badgesRecyclerView.setLayoutManager(badgesGridLayoutManager);
        badgesAdapter = new Badges_Adapter(BadgesActivity.this, BadgesListArr, BadgesImageArr);
        badgesRecyclerView.setAdapter(badgesAdapter);

    }
}
