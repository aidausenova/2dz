package com.company;

public class Son extends Family{

    private String name;
    private int age;
    private int teeth;

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

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public Son(String name, int age, int teeth) {
        this.name = name;
        this.age = age;
        this.teeth = teeth;
    }
}
