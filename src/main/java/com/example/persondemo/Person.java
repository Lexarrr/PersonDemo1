package com.example.persondemo;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    String firstName;
    String lastName;
    String birth;
    int age;

    String profession;


    public Person(String firstName, String lastName,
                  String profession, String birth, int age) throws MineException {
        if(firstName == null || lastName == null || profession == null || birth == null|| age == 0){
            throw new MineException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.birth = birth;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth='" + birth + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(birth, person.birth) && Objects.equals(profession, person.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birth, age, profession);
    }
}
