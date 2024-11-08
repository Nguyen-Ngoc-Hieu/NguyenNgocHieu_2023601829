/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Person {
    private String name;
    private String dob;
    private String pob;
    private char gender;
    private String email;
    private String phone;

    public Person() {
    }

    public Person(String name, String dob, String pob, char gender, String email, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email + ", phone=" + phone + '}';
    }
     public void nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.printf("nhap ten: "); name = sc.nextLine();
         System.out.printf("nhap ngay sinh: "); dob = sc.nextLine();
         System.out.printf("nhap noi sinh: "); pob = sc.nextLine();
         System.out.printf("nhap gioi tinh: "); gender = sc.next().charAt(0); 
         sc.nextLine();
         System.out.printf("nhap email: "); email = sc.nextLine();
         System.out.printf("nhap so dien thoai: "); phone = sc.nextLine();
     }
}
