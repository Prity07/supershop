package com.company.OopExercises;

public class University {
    private int id;
    private String name;

    public University(int id, String name){
        this.id =  id;
        this.name = name;
    }

    public University changeUniversityName(String newName){
        this.name = newName;
        return this;
    }
    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        String r = "name = "+ this.name +"||||";
        return r;
    }
}
