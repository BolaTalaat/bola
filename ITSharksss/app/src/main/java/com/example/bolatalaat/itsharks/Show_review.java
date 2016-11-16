package com.example.bolatalaat.itsharks;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Show_review extends Fragment
{
    ArrayList<Show_Object> Myobject=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.show_review,null);
        final ListView list=(ListView)view.findViewById(R.id.show_list);

        String url="http://192.168.1.101/review.php?f=show";
        RequestQueue queue= Volley.newRequestQueue(getActivity());
        StringRequest request=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    Log.d("Test",response);
                    JSONObject object=new JSONObject(response);
                    JSONArray response2=object.getJSONArray("list");
                    for (int i=0;i<response2.length();i++)
                    {
                        JSONObject object1=response2.getJSONObject(i);
                        String name=object1.getString("Name");
                        String course=object1.getString("course");
                        String review=object1.getString("review_txt");
                        Myobject.add(new Show_Object(name,course,review));
                    }
                    Show_Adapter adapter=new Show_Adapter(getActivity(),Myobject);
                    list.setAdapter(adapter);
                }
                catch (JSONException e)
                {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(getActivity(), "Error Connection", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(request);
        return view;
    }
}
