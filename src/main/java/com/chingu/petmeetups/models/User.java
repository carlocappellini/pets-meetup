package com.chingu.petmeetups.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "username can't be blank")
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "password can't be blank")
    @Size(min = 8, message ="password must be at least 8 characters long")
    @Column(nullable = false, unique = true)
    @JsonIgnore
    private String password;

    @NotEmpty(message = "email can't be blank")
    @Column(nullable = false, unique = true)
    private String email;

    @Column(insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date date;




    public User() {
    }


    public User(User copy) {
        id = copy.id;
        email = copy.email;
        username = copy.username;
        password = copy.password;

        date = copy.date;
    }

    public User(long id, String username, String password, String email,Date date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.date = date;
    }

    public User(long id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}


