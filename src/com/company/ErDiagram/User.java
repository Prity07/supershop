package com.company.ErDiagram;

public class User {
    private int id;
    private String name;
    private String profileImage;
    private String email;
    private String password;
    private Role role;

    public User(int id, String name, String email, Role role){
        this.id = id;
        this.name = name;
        this.email=email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
