package com.sky.designpattern.decorator.project;

public class ProductManager extends Manager {

    public ProductManager(Project project) {
        super(project);
    }
    
    @Override
    public void beforeCoding() {
        System.out.println("ProductManager do job beforeCoding");
    }

    @Override
    public void afterCoding() {
        System.out.println("ProductManager do job afterCoding");
    }

}
