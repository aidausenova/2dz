package com.company;

public class Mother extends Family{
    public String name;
    public int age;

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

    public Mother(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
