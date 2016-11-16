package com.example.bolatalaat.itsharks;

public class Show_Object
{
    String review_name,course_name,review_txt;
    public Show_Object(String review_name,String course_name,String review_txt)
    {
        this.review_name=review_name;
        this.course_name=course_name;
        this.review_txt=review_txt;
    }

    public String getReview_name()
    {
        return this.review_name;
    }

    public String getCourse_name()
    {
        return this.course_name;
    }

    public String getReview_txt()
    {
        return this.review_txt;
    }

}
