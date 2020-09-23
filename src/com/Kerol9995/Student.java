package com.Kerol9995;

public class Student {

    private int id;
    private String name;
    private String surname;
    private String middle_name;
    private int year_of_birth;
    private String address;
    private int telephone;
    private int faculty;
    private int course;
    private int group;

    public Student() {
        super();
    }

    public Student(int id, String name, String surname, String middle_name, int year_of_birth, String address, int telephone, int faculty, int course, int group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.year_of_birth = year_of_birth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String name, int year_of_birth, String address, int telephone) {
        this.id = id;
        this.name = name;
        this.year_of_birth = year_of_birth;
        this.address = address;
        this.telephone = telephone;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", year_of_birth=" + year_of_birth +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", faculty=" + faculty +
                ", course=" + course +
                ", group=" + group +
                '}';
    }

}