package com.test.vinove.myapplication_vinove.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.vinove.myapplication_vinove.R;


public class AccountsFragment extends android.support.v4.app.Fragment {
    View view;

    public AccountsFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.profile_account_fragment,container,false);



         return view;

    }
}
