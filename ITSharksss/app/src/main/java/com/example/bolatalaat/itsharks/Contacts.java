package com.example.bolatalaat.itsharks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Contacts extends AppCompatActivity
{
    ImageButton face,google,call;
    TextView address,mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);
        face=(ImageButton)findViewById(R.id.facebook);
        google=(ImageButton)findViewById(R.id.google);
        call=(ImageButton)findViewById(R.id.call);
        address=(TextView)findViewById(R.id.address);
        mobile=(TextView)findViewById(R.id.mobile);
        String addres="28 Military Engineers Tower,\n Next to Sadat Academy and Smart Computer mall,\n" +
                " Maadi, Cairo, Egypt, Cairo, Egypt, 11728";
        final String phone="01281214755";
        mobile.setText(phone);
        address.setText(addres);
        face.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                Uri uri=Uri.parse("https://www.facebook.com/ITSharks/");
                intent.setData(uri);
                startActivity(intent);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                Uri uri=Uri.parse("tel:"+phone.trim());
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(uri);
                startActivity(intent);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                Uri uri=Uri.parse("https://plus.google.com/+ITSharksTrainingCenterCairo");
                intent.setData(uri);
                startActivity(intent);
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
            Intent intent=new Intent(Contacts.this,Courses.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.inst)
        {
            Intent intent=new Intent(Contacts.this,Instructors.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.review)
        {
            Intent intent=new Intent(Contacts.this,Reviews.class);
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
