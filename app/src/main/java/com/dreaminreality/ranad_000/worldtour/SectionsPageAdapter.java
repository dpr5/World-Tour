package com.dreaminreality.ranad_000.worldtour;

/**
 * Created by ranad_000 on 10/6/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> FragmentList = new ArrayList<>();
    private final List<String> FragmentString = new ArrayList<>();


    public void addFragment(Fragment fragment, String title){
        FragmentList.add(fragment);
        FragmentString.add(title);
    }

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentString.get(position);
    }

    @Override
    public Fragment getItem(int position) {

        return FragmentList.get(position);
    }

    @Override
    public int getCount()
    {
        return FragmentList.size();
    }
}
