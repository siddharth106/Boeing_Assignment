package com.stackroute.unittest;

public class Member {
    int age;
    int salary;
    String name;
      public void setName(String s){

          name=s;
      };
    public void setAge(int age){

       this.age=age;
    };
    public void setSalary(int sal){

       this.salary=sal;
    };
      public String toString(){
          return ("Name is: "+name+" age is: "+age+" salary is: "+salary);
      }


}
