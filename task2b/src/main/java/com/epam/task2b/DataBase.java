package com.epam.task2b;

import com.epam.chocolates.Chocolate;
import com.epam.chocolates.Kitkat;
import com.epam.chocolates.Reeses;
import com.epam.chocolates.Snickers;
import com.epam.sweets.GulabJamun;
import com.epam.sweets.Jalebi;
import com.epam.sweets.Rasmalai;
import com.epam.sweets.Sweet;

public final class Database {
    public static final Chocolate[] chocolates = {
            new Kitkat("Kitkat", 10.50f, 15.0f),
            new Reeses("Reeses", 50.75f, 13.06f),
            new Snickers("Snickers", 60.25f, 30.0f)
    };
    public static final Sweet[] sweets = {
            new GulabJamun("GulabJamun", 45.0f, 20.5f),
            new Jalebi("Jalebi", 20.0f, 30),
            new Rasmalai("Rasmalai", 10, 20)
    };


}
 50  src/main/java/com/epam/chocolates/Chocolate.java 
@@ -0,0 +1,50 @@
package com.epam.chocolates;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private float price;
    private float weight;

    public Chocolate(String name, float price, float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Chocolate \n" +
                "Name= " + name + '\n' +
                "Price= " + price + '\n' +
                "Weight= " + weight + '\n';
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int compareTo(Chocolate o) {
        return (int) (this.getPrice() - o.getPrice());
    }
}