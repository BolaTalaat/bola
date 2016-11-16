package com.example.bolatalaat.itsharks;

public class Course_Object
{
    int course_image;
    String course_name;

    public Course_Object(int course_image,String course_name)
    {
        this.course_image=course_image;
        this.course_name=course_name;
    }
    public int getCourse_image()
    {
        return this.course_image;
    }

    public String getCourse_name()
    {
        return this.course_name;
    }
}
