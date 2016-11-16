package com.example.bolatalaat.itsharks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class home extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
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
            Intent intent=new Intent(home.this,Courses.class);
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

        if(id==R.id.contact)
        {
            Intent intent=new Intent(home.this,Contacts.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.review)
        {
            Intent intent=new Intent(home.this,Reviews.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.inst)
        {
            Intent intent=new Intent(home.this,Instructors.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
