package com.example.Coder.Request;

public class UserRegisterRequest {
    private String Username;
    private String email;
    private String password;
    private String Role;

    public UserRegisterRequest() {
    }

    public UserRegisterRequest(String username, String email, String password, String role) {
        Username = username;
        this.email = email;
        this.password = password;
        this.Role = role;

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

}
