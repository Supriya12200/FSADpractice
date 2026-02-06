package com.klu;

class Box<T> {
 private T value;

 
 public Box(T value) {
     this.value = value;
 }

 
 public T getValue() {
     return value;
 }

 
 public void setValue(T value) {
     this.value = value;
 }
}
public class endlabgenraticdemo {

	public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        System.out.println("Integer value: " + intBox.getValue());

        // Box with String
        Box<String> strBox = new Box<>("Hello Generics!");
        System.out.println("String value: " + strBox.getValue());

        // Box with Double
        Box<Double> doubleBox = new Box<>(99.99);
        System.out.println("Double value: " + doubleBox.getValue());

        // Box with custom type (e.g., Person class)
        Box<Person> personBox = new Box<>(new Person("Supriya", 22));
        System.out.println("Person value: " + personBox.getValue());
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }

	}


