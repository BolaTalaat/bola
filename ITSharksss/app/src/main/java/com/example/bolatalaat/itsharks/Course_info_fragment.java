package com.example.bolatalaat.itsharks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Course_info_fragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.course_info,null);
        Bundle b=getActivity().getIntent().getExtras();
        int image=b.getInt("image");
        ImageView im=(ImageView)view.findViewById(R.id.cimage);
        im.setImageResource(image);
        String weeks=b.getString("weeks");
        String hours=b.getString("hours");
        TextView c_week=(TextView)view.findViewById(R.id.c_weeks);
        c_week.setText(weeks);
        TextView c_hour=(TextView)view.findViewById(R.id.c_hours);
        c_hour.setText(hours);

        return view;
    }

}
