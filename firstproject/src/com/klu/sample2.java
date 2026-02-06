package com.klu;

class Empl {
    private int age;
    private int id;
    private String name;
    private float weight;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
}

public class sample2 {
    public static void main(String[] args) {
        Empl e = new Empl();

       
        e.setAge(25);
        e.setId(101);
        e.setName("Supriya");
        e.setWeight(55.5f);

       
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Age: " + e.getAge());
        System.out.println("Employee Weight: " + e.getWeight());
    }
}
