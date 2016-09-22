package com.yanin.greendaodemo.factory;

import com.yanin.greendaodemo.model.Teacher;

import java.util.Random;

public class TeacherFactory {

    private static final String[] lastNames = {"王", "陳", "林", "洪", "楊", "許", "蔡", "詹"};

    private String generateName(){
        Random random = new Random();
        int lastIndex = random.nextInt(lastNames.length);

        return lastNames[lastIndex] + "老師";
    }


    public Teacher generateTeacher(){
        return new Teacher(null, generateName());
    }
}
