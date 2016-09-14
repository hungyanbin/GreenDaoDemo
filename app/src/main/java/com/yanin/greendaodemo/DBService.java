package com.yanin.greendaodemo;

import android.content.Context;

import com.yanin.greendaodemo.model.DaoMaster;
import com.yanin.greendaodemo.model.DaoSession;

public class DBService {

    private static final String DB_NAME = "greedDaoDemo.db";
    private DaoSession daoSession;

    public void init(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME);

        DaoMaster daoMaster = new DaoMaster(helper.getWritableDatabase());

        daoSession = daoMaster.newSession();
    }
}
