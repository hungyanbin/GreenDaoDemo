package com.yanin.greendaodemo.factory;

import java.util.Random;

public class NameFactory {

    private static final String[] lastNames = {"王", "陳", "林", "洪", "楊", "許", "蔡", "詹"};
    private static final String[] firstNames = {"冠廷", "雅婷", "冠宇", "怡萱", "家豪", "怡君", "承翰", "詩涵", "伯翰", "怡婷"};

    public String generateName(){
        Random random = new Random();
        int lastIndex = random.nextInt(lastNames.length);
        int firstIndex = random.nextInt(firstNames.length);

        return lastNames[lastIndex] + firstNames[firstIndex];
    }
}
