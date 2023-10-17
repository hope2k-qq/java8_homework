package com.company.user;

import java.util.Objects;

public class User {
    private String name;
    private int old;
    private String phone;

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return old == user.old && Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, phone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getPhone() {
        return phone;
    }
}
