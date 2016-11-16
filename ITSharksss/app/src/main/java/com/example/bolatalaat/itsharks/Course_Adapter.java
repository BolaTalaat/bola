package com.example.bolatalaat.itsharks;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Course_Adapter extends BaseAdapter
{
    ArrayList<Course_Object> Mylist=new ArrayList<>();
    Activity activity;

    public Course_Adapter(ArrayList<Course_Object> Mylist,Activity activity)
    {
        this.Mylist=Mylist;
        this.activity=activity;
    }

    @Override
    public int getCount()
    {
        return Mylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view=inflater.inflate(R.layout.courses_lay,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.course_image);
        imageView.setImageResource(Mylist.get(position).getCourse_image());
        TextView textView=(TextView)view.findViewById(R.id.course_name);
        textView.setText(Mylist.get(position).getCourse_name());
        return view;
    }
}
