package com.example.bolatalaat.itsharks;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Courses extends AppCompatActivity
{
    ListView c_list;
    ArrayList<Course_Object> Mylist=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses);

        c_list=(ListView)findViewById(R.id.courses_list);

        final Database database=new Database(Courses.this);
        final SQLiteDatabase sql_db=database.getReadableDatabase();
        final Cursor cursor=sql_db.query(Database.TABLE_COURSES,null,null,null,null,null,null);
        if(cursor.moveToFirst())
        {
            do
            {
                int image=cursor.getInt(cursor.getColumnIndex(Database.COURSE_IMAGE));
                String name=cursor.getString(cursor.getColumnIndex(Database.COURSE_NAME));
                Mylist.add(new Course_Object(image,name));
            }
            while(cursor.moveToNext());
        }
        Course_Adapter adapter=new Course_Adapter(Mylist,Courses.this);
        c_list.setAdapter(adapter);

        c_list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                int image=Mylist.get(position).getCourse_image();
                String name=Mylist.get(position).getCourse_name();
                Cursor cursor1=sql_db.rawQuery("Select hours, weeks, content from " + database.TABLE_COURSES + " where " + image + " = " + Database.COURSE_IMAGE , null);
                String content,hours,weeks;
                if (cursor1.moveToFirst())
                {
                    do
                    {
                        content=cursor1.getString(cursor1.getColumnIndex(Database.COURSE_CONTENT));
                        hours=cursor1.getString(cursor1.getColumnIndex(Database.COURSE_HOURS));
                        weeks=cursor1.getString(cursor1.getColumnIndex(Database.COURSE_WEEKS));
                    }
                    while (cursor1.moveToNext());
                    Intent intent=new Intent(Courses.this,Course_data.class);
                    intent.putExtra("image",image);
                    intent.putExtra("name",name);
                    intent.putExtra("content",content);
                    intent.putExtra("hours",hours);
                    intent.putExtra("weeks",weeks);
                    startActivity(intent);
                }
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

        if(id==R.id.contact)
        {
            Intent intent=new Intent(Courses.this,Contacts.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.inst)
        {
            Intent intent=new Intent(Courses.this,Instructors.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.review)
        {
            Intent intent=new Intent(Courses.this,Reviews.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.location)
        {
            Intent intent =new Intent(Intent.ACTION_VIEW);
            Uri uri= Uri.parse("geo:0,0?q=it sharks");
            intent.setData(uri);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
