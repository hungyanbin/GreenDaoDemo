package com.yanin.greendaodemo.factory;

import com.yanin.greendaodemo.model.Student;

import java.util.Random;

public class StudentFactory {

    private static final String[] lastNames = {"王", "陳", "林", "洪", "楊", "許", "蔡", "詹"};
    private static final String[] firstNames = {"冠廷", "雅婷", "冠宇", "怡萱", "家豪", "怡君", "承翰", "詩涵", "伯翰", "怡婷"};

    private String generateName(){
        Random random = new Random();
        int lastIndex = random.nextInt(lastNames.length);
        int firstIndex = random.nextInt(firstNames.length);

        return lastNames[lastIndex] + firstNames[firstIndex];
    }

    private int generateAge(){
        Random random = new Random();
        final int startAge = 10;
        final int range = 10;

        return startAge + random.nextInt(range);
    }

    public Student generateStudent(){
        return new Student(null, 0, generateName(), generateAge());
    }
}
