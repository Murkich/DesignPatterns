package com.dnoviy.creational.abstractfactory.website;

import com.dnoviy.creational.abstractfactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes java code");
    }
}
