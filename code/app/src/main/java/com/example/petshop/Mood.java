package com.example.petshop;

import androidx.annotation.NonNull;

import java.util.Date;

public abstract class Mood {
    private Date date;


    public Mood() {
        this.date = new Date(System.currentTimeMillis());
    }
    public Mood(Date date) {
        this.date = date;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @NonNull
    @Override
    public abstract String toString();
}
