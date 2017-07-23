package com.sky.designpattern.decorator.project;

public abstract class Manager implements Project {

    protected Project project;
    
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    public Manager(Project project) {
        setProject(project);
    }

    @Override
    public void doCoding() {
        beforeCoding();
        
        project.doCoding();
        
        afterCoding();
        
    }

    public abstract void beforeCoding();
    
    public abstract void afterCoding();
}
