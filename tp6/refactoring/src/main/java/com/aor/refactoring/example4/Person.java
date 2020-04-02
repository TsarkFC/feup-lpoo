package com.aor.refactoring.example4;

import java.util.Objects;

public class Person {
    private final String name;
    private final String phone;

    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
