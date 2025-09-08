package me.billal;

public class User {
    // Fields
    private final String name;

    public User(String name) {
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("hello " + this.name);
    }
}
