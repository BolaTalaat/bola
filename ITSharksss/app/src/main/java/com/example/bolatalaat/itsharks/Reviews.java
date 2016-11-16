package com.example.bolatalaat.itsharks;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Reviews extends AppCompatActivity
{
    TabLayout tab;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reviews);

        tab=(TabLayout)findViewById(R.id.tab2);
        tab.addTab(tab.newTab().setText("ADD Review"));
        tab.addTab(tab.newTab().setText("Show Reviews"));
        tab.setTabGravity(TabLayout.GRAVITY_FILL);

        pager=(ViewPager)findViewById(R.id.pager2);
        Review_Adapter adapter=new Review_Adapter(getSupportFragmentManager(),tab.getTabCount());
        pager.setAdapter(adapter);

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));

        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id=item.getItemId();
        if(id==R.id.courses)
        {
            Intent intent=new Intent(Reviews.this,Courses.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.inst)
        {
            Intent intent=new Intent(Reviews.this,Instructors.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.contact)
        {
            Intent intent=new Intent(Reviews.this,Contacts.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.location)
        {
            Intent intent =new Intent(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("geo:0,0?q=it sharks");
            intent.setData(uri);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
