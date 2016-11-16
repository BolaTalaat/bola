package com.example.bolatalaat.itsharks;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Review_Adapter extends FragmentStatePagerAdapter
{
    int num_tabs;
    public Review_Adapter(FragmentManager fm,int num_tabs)
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
                Add_review f1=new Add_review();
                return  f1;
            case 1:
                Show_review f2=new Show_review();
                return f2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.num_tabs;
    }
}
