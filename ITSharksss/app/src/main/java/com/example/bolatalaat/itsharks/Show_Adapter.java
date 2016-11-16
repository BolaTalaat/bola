package com.example.bolatalaat.itsharks;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Show_Adapter extends BaseAdapter
{
    Activity activity;
    ArrayList<Show_Object> Mylist=new ArrayList<>();

    public Show_Adapter(Activity activity,ArrayList<Show_Object> Mylist)
    {
        this.activity=activity;
        this.Mylist=Mylist;
    }

    @Override
    public int getCount()
    {
        return this.Mylist.size();
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view=inflater.inflate(R.layout.review_list,null);
        TextView review_name=(TextView)view.findViewById(R.id.name_review);
        review_name.setText(Mylist.get(position).getReview_name());
        TextView course_name=(TextView)view.findViewById(R.id.name_course);
        course_name.setText(Mylist.get(position).getCourse_name());
        TextView review_txt=(TextView)view.findViewById(R.id.review);
        review_txt.setText(Mylist.get(position).getReview_txt());
        return view;
    }
}
