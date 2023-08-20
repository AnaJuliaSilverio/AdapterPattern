package org.example.domain.entity;

public class User {
    private String name;
    private String email;

    public User(String name, String email, String passoword) {
        this.name = name;
        this.email = email;
        this.passoword = passoword;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    private String passoword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
