package com.yanin.greendaodemo.model;

import android.support.annotation.NonNull;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Teacher {

    @Id(autoincrement = true)
    private Long id;

    @NonNull
    private String name;

    @Generated(hash = 530788891)
    public Teacher(Long id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 1630413260)
    public Teacher() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
