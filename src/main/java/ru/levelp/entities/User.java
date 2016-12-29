package ru.levelp.entities;


import javax.persistence.*;

//hibernate
@Entity
//morphia
@org.mongodb.morphia.annotations.Entity("users")
//hibernate
@Table(name = "users")
public class User implements BaseEntity<String> {
    //hibernate
    @Id
    //morphia
    @org.mongodb.morphia.annotations.Id
    private String id;
    @Column(name = "email") //hib
    private String email;
    @Column(name = "pwdHash") //hib
    private String pwdHash;
    @Column(name = "name") //hib
    private String name;
    @Column(name = "token") //hib
    private String token;

    public User() {
    }

    public User(String id, String email, String pwdHash, String name, String token) {
        this.id = id;
        this.email = email;
        this.pwdHash = pwdHash;
        this.name = name;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPwdHash() {
        return pwdHash;
    }

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
