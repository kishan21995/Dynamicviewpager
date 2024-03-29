package com.e.dynamicviewpager.mFragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class MyPagerAdapter4 extends FragmentPagerAdapter {

    ArrayList <Fragment> fragments = new ArrayList<>();

    public MyPagerAdapter4(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }


    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addFragment(Fragment f)
    {
        fragments.add(f);
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return ((Fragment4)fragments.get(position)).getTitle();
    }
}