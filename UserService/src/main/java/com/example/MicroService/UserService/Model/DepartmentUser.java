package com.example.MicroService.UserService.Model;

public class DepartmentUser {
    private User user;

    private Department dept;

    public DepartmentUser() {
    }

    public DepartmentUser(User user, Department dept) {
        this.user = user;
        this.dept = dept;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
