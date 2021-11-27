package com.marcelodebittencourt;

public class Client {
    int id;
    String name;

    public Client(int id, String name) {
        setId(id);
        setName(name);
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

    public String toString() {
        return "ID: " + getId() + " NAME: " + getName() + "\n";
    }

}