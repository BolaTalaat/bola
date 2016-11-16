package com.example.bolatalaat.itsharks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Course_content_fragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.course_content,null);
        Bundle b=getActivity().getIntent().getExtras();
        String str_content=b.getString("content");
        TextView txt_content=(TextView)view.findViewById(R.id.c_content);
        txt_content.setText(str_content);
        txt_content.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }

}
