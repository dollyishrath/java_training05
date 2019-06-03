package com.trimindtech.training.day05;

public class Student {

    public Student (String name,String id){
        this.name = name;
        this.id = id;

    }
    public String name;
    public String id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        boolean nameMatched = this.getName().equals(student.getName());
        boolean idMatched = this.getId().equals(student.getId());
        return nameMatched && idMatched;
    }
}
