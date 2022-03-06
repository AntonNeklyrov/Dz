package com.company;

public abstract class Human implements SayWhoIam{
    protected static String name;
    protected static String surname;
    protected static int age;

    public Human(String name, String surname, int age) {
        Human.name = name;
        Human.surname = surname;
        Human.age = age;
    }

    public void setName(String name) {
        Human.name = name;
    }

    public void setSurname(String surname) {
        Human.surname = surname;
    }

    public void setAge(int age) {
        Human.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public  int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name:" + name + "  surname:" + surname + "   age:" + age;
    }
}
