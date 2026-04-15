package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private int weight;
    private  String hair;
    public  Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName, String lastName,int age, double height, int weight, String hair){
        this(firstName,lastName,age);
        this.height=height;
        this.weight=weight;
        this.hair=hair;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if (age>=13 && age<=19){
            return true;
        }
        return false;
    }
}
