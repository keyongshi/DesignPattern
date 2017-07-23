package com.sky.designpattern.decorator.project;

public class ProjectTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Project coder = new Coder();
        Project manager = new ProductManager(coder);
        
        manager.doCoding();

    }

}
