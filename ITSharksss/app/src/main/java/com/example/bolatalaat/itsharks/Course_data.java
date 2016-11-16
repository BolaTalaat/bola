package com.example.bolatalaat.itsharks;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Course_data extends AppCompatActivity
{
    TabLayout tb;
    ViewPager vp;
   @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_data);
        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        TextView txt=(TextView)findViewById(R.id.cname);
        txt.setText(name);
        //imageView=(ImageView)findViewById(R.id.c_image);
        //imageView.setImageResource(image);
        tb=(TabLayout)findViewById(R.id.tab);
        tb.addTab(tb.newTab().setText("Course Information"));
        tb.addTab(tb.newTab().setText("Course Content"));
        tb.setTabGravity(TabLayout.GRAVITY_FILL);

        vp=(ViewPager)findViewById(R.id.pager);
        Fragment_Adapter adapter=new Fragment_Adapter(getSupportFragmentManager(),tb.getTabCount());
        vp.setAdapter(adapter);


        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb));

        tb.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
