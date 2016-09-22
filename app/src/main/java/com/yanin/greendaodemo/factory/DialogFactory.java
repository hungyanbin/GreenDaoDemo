package com.yanin.greendaodemo.factory;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.yanin.greendaodemo.DBService;
import com.yanin.greendaodemo.R;
import com.yanin.greendaodemo.model.Student;
import com.yanin.greendaodemo.model.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class DialogFactory {

    private DialogFactory(){

    }

    public static AlertDialog getStudentDialog(Context context){
        DBService dbService = ServiceFactory.getDbService();
        StudentDao studentDao = dbService.getStudentDao();
        List<Student> students = studentDao.loadAll();
        List<String> items = new ArrayList<>(students.size());
        List<Boolean> checkItems = new ArrayList<>(students.size());

        for (int i = 0; i < students.size(); i++) {
            items.add(students.get(i).getName());
            checkItems.add(false);
        }


        return new AlertDialog.Builder(context)
                .setMultiChoiceItems(items.toArray(new String[students.size()]), null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                    }
                }).setPositiveButton(context.getString(R.string.confirm), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).create();
    }
}
