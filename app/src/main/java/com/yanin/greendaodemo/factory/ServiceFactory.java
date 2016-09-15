package com.yanin.greendaodemo.factory;

import com.yanin.greendaodemo.DBService;

public class ServiceFactory {

    private ServiceFactory(){

    }

    private static DBService dbService;

    public static DBService getDbService(){
        if(dbService == null){
            dbService = new DBService();
        }

        return dbService;
    }
}
