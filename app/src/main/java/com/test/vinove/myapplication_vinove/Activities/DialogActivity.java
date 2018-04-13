package com.test.vinove.myapplication_vinove.Activities;


import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.test.vinove.myapplication_vinove.R;

public class DialogActivity extends AppCompatActivity {
    Dialog dialog;
    Button releaseShiftBtn;
    Context context = DialogActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        releaseShiftBtn = findViewById(R.id.release_shift);


        releaseShiftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setComponent(new ComponentName(context, ProfileActivity.class));
                startActivity(i);
            }
        });


    }

    public void custom(View view) {
        dialog = new Dialog(this);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog);
        dialog.show();

        ImageView b = dialog.findViewById(R.id.close);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }


    public void callManager(View view) {
        Intent i = new Intent();
        i.setComponent(new ComponentName(context, GraphActivity.class));
        startActivity(i);

    }

}