package com.company;

public class Student extends Human {
    public Student(String name, String surname, int age) {
        super(name, surname,age);
    }

    @Override
    public void iAm() {
        System.out.println("i am student" + name + " " + surname);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
