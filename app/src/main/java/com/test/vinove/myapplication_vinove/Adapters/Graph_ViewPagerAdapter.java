package com.test.vinove.myapplication_vinove.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class Graph_ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();// store item fragment
    private final List<String> fragmentTitleList = new ArrayList<>();// tab_layout item title

    public Graph_ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
      // return null;
         return fragmentTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String s){

        fragmentList.add(fragment);
        fragmentTitleList.add(s);
    }


}