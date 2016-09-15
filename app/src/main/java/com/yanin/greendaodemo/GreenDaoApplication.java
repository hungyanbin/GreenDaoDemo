package com.yanin.greendaodemo;

import android.app.Application;

import com.yanin.greendaodemo.factory.ServiceFactory;

public class GreenDaoApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        DBService dbService = ServiceFactory.getDbService();
        dbService.init(this);
    }
}
