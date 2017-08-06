package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import static android.R.attr.name;

public class ReportCard{

    private String mName;
    private String[] mClasses;
    private String[] mGrades;

    public ReportCard(){
        String name = "Tarik";
        String[] classes = {"Math", "Science", "English", "Art", "Social Studies"};
        String[] grades = {"A", "A", "B", "C", "C"};
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Student Name='" + mName + '\'' +
                "Student Classes=" + Arrays.toString(mClasses) +
                "Student Grades=" + Arrays.toString(mGrades) +
                '}';
    }

    public void setName(String name){
        mName = name;
    }
    public void setClasses(String[] classes){
        mClasses = classes;
    }

    public void setGraddes(String[] grades){
        mGrades = grades;
    }

    public String getName(){
        return mName;
    }

    public String[] getClasses(){
        return mClasses;
    }

    public String[] getGrades(){
        return mGrades;
    }
}
