/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhf
 */
public class Student {
    private int id;
    private String studentrollnumber;
    private String fullname;
    private String gender;
    private String email;
    private String phone_number;
    private String address;
    private String image;

    public Student() {
    }

    public Student(int id, String studentrollnumber, String fullname, String gender, String email, String phone_number, String address, String image) {
        this.id = id;
        this.studentrollnumber = studentrollnumber;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentrollnumber() {
        return studentrollnumber;
    }

    public void setStudentrollnumber(String studentrollnumber) {
        this.studentrollnumber = studentrollnumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
 
}
