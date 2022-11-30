package com.dnoviy.structural.composite;

public class Project {
    public static void main(String[] args) {
        Folder folder = new Folder("dnoviy");
        folder.addInputFolder();
        folder.addInputFile();

        System.out.println(folder);
    }
}
