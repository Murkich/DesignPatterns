package com.dnoviy.creational.abstractfactory.banking;

import com.dnoviy.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
