package com.example.bolatalaat.itsharks;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Add_review extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.add_review,null);
        final EditText review_name=(EditText)view.findViewById(R.id.review_name);
        final EditText course_name=(EditText)view.findViewById(R.id.cou_name);
        final EditText review_txt=(EditText)view.findViewById(R.id.review_txt);
        Button add=(Button) view.findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final String user_name=review_name.getText().toString();
                final String course=course_name.getText().toString();
                final String review_text=review_txt.getText().toString();
                RequestQueue queue= Volley.newRequestQueue(getActivity());
                StringRequest request=new StringRequest(Request.Method.POST,"http://192.168.1.101/review.php?f=save", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("Test",response);
                        try {
                            JSONObject object=new JSONObject(response);
                            String result=object.getString("response");
                            if(result.equalsIgnoreCase("Done"))
                            {
                                Toast.makeText(getActivity(), "Adding Review Done", Toast.LENGTH_SHORT).show();
                            }
                            else
                                Toast.makeText(getActivity(), "Adding Review not Done!", Toast.LENGTH_SHORT).show();
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("error",error.toString());
                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String>map=new HashMap<String, String>();
                        map.put("username",user_name);
                        map.put("course",course);
                        map.put("review_txt",review_text);
                        return map;
                    }
                };
                queue.add(request);
            }
        });


        return view;
    }
}
