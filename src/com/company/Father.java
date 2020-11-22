package com.company;

public class Father extends Family{
    private String name;
    private int age;
    private int weight;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Father(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}

