package com.example.recycler.model;

public class Item {
    private String name;
    private int img;

    public Item(String n, int imageNumber) {
        name = n;
        img = imageNumber;
    }

    public String getName() { return name; }
    public int getImage() { return img; }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int imageNumber) {
        this.img = imageNumber;
    }
}
