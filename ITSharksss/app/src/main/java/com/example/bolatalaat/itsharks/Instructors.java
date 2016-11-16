package com.example.bolatalaat.itsharks;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Instructors extends AppCompatActivity
{
    ArrayList<Inst_Object> Myobject=new ArrayList<Inst_Object>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructors);
        listView=(ListView)findViewById(R.id.list);
        final Database database=new Database(Instructors.this);
        final SQLiteDatabase sql_db=database.getReadableDatabase();
        Cursor cursor=sql_db.query(Database.TABLE_INSTRUCTORS,null,null,null,null,null,null);
        if (cursor.moveToFirst())
        {
            do
            {
                int image=cursor.getInt(cursor.getColumnIndex(Database.INSTRUCTOR_IMAGE));
                String name=cursor.getString(cursor.getColumnIndex(Database.INSTRUCTOR_NAME));
                String course=cursor.getString(cursor.getColumnIndex(Database.INSTRUCTOR_COURSE));
                Myobject.add(new Inst_Object(image,name,course));
            }
            while (cursor.moveToNext());
            Inst_Adapter adapter=new Inst_Adapter(Instructors.this,Myobject);
            listView.setAdapter(adapter);
        }
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
            Intent intent=new Intent(Instructors.this,Courses.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.contact)
        {
            Intent intent=new Intent(Instructors.this,Contacts.class);
            startActivity(intent);
            return true;
        }

        if(id==R.id.review)
        {
            Intent intent=new Intent(Instructors.this,Reviews.class);
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
