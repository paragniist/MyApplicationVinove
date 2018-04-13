package com.test.vinove.myapplication_vinove.Fragments;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.test.vinove.myapplication_vinove.Activities.BadgesActivity;
import com.test.vinove.myapplication_vinove.Adapters.Profile_BadgesAdapter;
import com.test.vinove.myapplication_vinove.R;


public class MyStatsFragment extends android.support.v4.app.Fragment {
    View view;
    RecyclerView myStatRecyclerView;
    LinearLayoutManager myStatLinearLayoutManager;

    String[] myStatListArr = {"Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap", "Top Performer", "Baby Gap"};

    int[] myStatImageArr = {R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap, R.drawable.top_performer, R.drawable.bitmap};


    public MyStatsFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.profile_mystats_fragment, container, false);

        myStatRecyclerView = view.findViewById(R.id.myStatRecyclerView);
        myStatLinearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);

        myStatRecyclerView.setLayoutManager(myStatLinearLayoutManager);

        Profile_BadgesAdapter myAdapter = new Profile_BadgesAdapter(getActivity(), myStatListArr, myStatImageArr);
        myStatRecyclerView.setAdapter(myAdapter);


        Button showBadges = view.findViewById(R.id.btnShowAllBadges);

        showBadges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showBadges();

            }
        })
        ;
        return view;

    }

    private void showBadges() {

        Intent i = new Intent();
        i.setComponent(new ComponentName(getActivity(), BadgesActivity.class));
        startActivity(i);


    }

}
