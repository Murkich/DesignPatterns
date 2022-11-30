package com.dnoviy.structural.composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private String creationDate;
    private List<Folder> folderList = new ArrayList<>();
    private List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addInputFolder(){
        this.folderList.add(new Folder("newFolder"));
        System.out.println("Folder is added");
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", folderList=" + folderList +
                ", fileList=" + fileList +
                '}';
    }

    public void addInputFile(){
        this.fileList.add(new File("dnoviyFile"));
        System.out.println("File is added");
    }
}
