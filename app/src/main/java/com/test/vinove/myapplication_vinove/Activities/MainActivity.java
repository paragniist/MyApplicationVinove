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

import com.test.vinove.myapplication_vinove.Adapters.BroadcastAdapter;
import com.test.vinove.myapplication_vinove.R;


public class MainActivity extends AppCompatActivity {

    String[] broadcastListArr = {"Broadcast from Arjun", "Message from Tito", "Broadcast from Arjun", "Message from Tito", "Message from Tito"};
    String[] broadcastListArr1 = {"1 day ago", "2 mins ago", "1 day ago", "2 mins ago", "2 mins ago"};

    RecyclerView BroadcastRecyclerView;
    LinearLayoutManager broadcastLinearLayoutManager;
    AppCompatButton raisedBtn;

    Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastRecyclerView = findViewById(R.id.BroadcastRecyclerView);
        raisedBtn = findViewById(R.id.raisedBtn);

        broadcastLinearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);

        BroadcastRecyclerView.setLayoutManager(broadcastLinearLayoutManager);

        BroadcastAdapter myAdapter = new BroadcastAdapter(context, broadcastListArr, broadcastListArr1);
        BroadcastRecyclerView.setAdapter(myAdapter);

        raisedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setComponent(new ComponentName(getApplicationContext(), CalenderActivity.class));
                startActivity(i);
            }
        });

    }
}
