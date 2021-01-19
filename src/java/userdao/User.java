/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userdao;
import java.sql.Date;
public class User {
    int id;
    String name;

    public User(int id, String name, String surname, String email, String phone, String password, Date date, String ehliyet) {
       
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.date = date;
        this.ehliyet = ehliyet;
         this.id = id;
    }

    public User(int id, String name, String surname, String email, String phone, Date date, String ehliyet) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.ehliyet = ehliyet;
    }
    String surname;
    String email;
    String phone;
    String password;
    Date date;
    String ehliyet;

    public User(String name, String surname, String email, String phone, Date date, String ehliyet) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.ehliyet = ehliyet;
    }

    public User(String name, String surname, String email, String phone, String ehliyet) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.ehliyet = ehliyet;
    }

    public User(String name, String surname, String email, String phone, String password, Date date, String ehliyet) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.date = date;
        this.ehliyet = ehliyet;
    }

    public String getEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(String ehliyet) {
        this.ehliyet = ehliyet;
    }

    public User(int id, String name, String surname, String email, String phone, Date date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User(int id, String name, String surname, String email, String phone, String password, Date date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.date = date;
    }

    public User() {
    }

    public User(int id, String name, String surname, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public User(String name, String surname, String email, String phone, String password, String ehliyet) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.ehliyet = ehliyet;
    }

   

    public User(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}