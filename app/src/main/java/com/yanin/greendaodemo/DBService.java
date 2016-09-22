package com.yanin.greendaodemo;

import android.content.Context;

import com.yanin.greendaodemo.model.DaoMaster;
import com.yanin.greendaodemo.model.DaoSession;
import com.yanin.greendaodemo.model.StudentDao;
import com.yanin.greendaodemo.model.TeacherDao;

public class DBService {

    private static final String DB_NAME = "greedDaoDemo.db";
    private DaoSession daoSession;

    public void init(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME);

        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());

        daoSession = daoMaster.newSession();
    }

    public StudentDao getStudentDao(){
        return daoSession.getStudentDao();
    }

    public TeacherDao getTeacherDao(){
        return daoSession.getTeacherDao();
    }
}
