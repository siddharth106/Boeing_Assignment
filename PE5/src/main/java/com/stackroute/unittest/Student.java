package com.stackroute.unittest.pe1;

public class Student {
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return id+" "+age+" "+name;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setAge(int age){
           this.age=age;
    }
    public void setName(String name){
       this.name=name;
    }
    public int getId(){
            return id;
    }
    public int getAge(){
           return age;
    }
    public String  getName(){
           return name;
    }
}
