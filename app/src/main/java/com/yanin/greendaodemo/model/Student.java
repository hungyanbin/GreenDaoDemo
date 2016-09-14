package com.yanin.greendaodemo.model;

import android.support.annotation.NonNull;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Student {

    @Id(autoincrement = true)
    private long id;

    @NonNull
    private String name;

    @Generated(hash = 296804189)
    public Student(long id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 1556870573)
    public Student() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
