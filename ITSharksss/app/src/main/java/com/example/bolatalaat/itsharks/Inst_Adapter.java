package com.example.bolatalaat.itsharks;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Inst_Adapter extends BaseAdapter
{
    Activity activity;
    ArrayList<Inst_Object> Myobject=new ArrayList<Inst_Object>();

    public Inst_Adapter (Activity activity,ArrayList<Inst_Object> myobject)
    {
        this.activity = activity;
        this.Myobject=myobject;

    }

    @Override
    public int getCount()
    {
        return Myobject.size();
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view=inflater.inflate(R.layout.inst,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.image_inst);
        TextView text_course=(TextView)view.findViewById(R.id.course_inst);
        TextView name=(TextView)view.findViewById(R.id.name_inst);
        imageView.setImageResource(Myobject.get(position).getImage());
        text_course.setText(Myobject.get(position).getCourse());
        name.setText(Myobject.get(position).getInst_name());
        return view;
    }
}
