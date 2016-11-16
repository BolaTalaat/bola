package com.example.bolatalaat.itsharks;



public class Inst_Object
{
    int image;
    String inst_name,course;
    public Inst_Object(int image,String inst_name,String course)
    {
        this.image=image;
        this.inst_name=inst_name;
        this.course=course;
    }

    public int getImage()
    {
        return this.image;
    }

    public String getInst_name()
    {
        return this.inst_name;
    }
    public String getCourse()
    {
        return this.course;
    }

}
