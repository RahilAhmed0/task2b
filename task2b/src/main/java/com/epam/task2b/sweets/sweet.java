package com.epam.task2b.sweets;

public class Sweet implements Comparable<Sweet> {
    private String name;
    private float price;
    private float weight;

    public Sweet(String name, float price, float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Sweet \n" +
                "Name= " + name + '\n' +
                "Price= " + price + '\n' +
                "Weight= " + weight + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int compareTo(Sweet o) {
        return (int) (this.getPrice() - o.getPrice());
    }
}