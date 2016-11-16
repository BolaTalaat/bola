package com.example.bolatalaat.itsharks;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class Fragment_Adapter extends FragmentStatePagerAdapter
{
    int num_tabs;

    public Fragment_Adapter(FragmentManager fm,int num_tabs)
    {
        super(fm);
        this.num_tabs=num_tabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                Course_info_fragment f1=new Course_info_fragment();
                return  f1;
            case 1:
                Course_content_fragment f2=new Course_content_fragment();
                return f2;
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return num_tabs;
    }
}
