package com.epam.task2b.gift;

import com.epam.chocolates.Chocolate;
import com.epam.sweets.Sweet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * The Gift class stores a collection of Chocolate's and Sweet's
 *
 * @author Keshav Lingala
 * @version 1.0
 */
public class Gift {
    private ArrayList<Chocolate> chocolates;
    private ArrayList<Sweet> sweets;

    public Gift() {
        this.chocolates = new ArrayList<Chocolate>();
        this.sweets = new ArrayList<Sweet>();
    }

    /**
     * This method is used to add more Chocolates to the Gift Item. This is
     *
     * @param chocolates takes n number of parameters of chocolates and add them Gift
     * @return boolean status of adding (True Added Successfully,False Failed to Add)
     */
    public boolean addChocolates(Chocolate... chocolates) {
        try {
            this.chocolates.addAll(Arrays.asList(chocolates));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * This method is used to add more Sweets to the Gift Item. This is
     *
     * @param sweets takes n number of parameters of sweets and add them Gift
     * @return boolean status of adding (True Added Successfully,False Failed to Add)
     */
    public boolean addSweets(Sweet... sweets) {
        try {
            this.sweets.addAll(Arrays.asList(sweets));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void sort() {
        Collections.sort(chocolates);
        Collections.sort(sweets);
    }

    /**
     * @return Returns Sum of weights of all chocolates and sweets
     */
    public float findTotalWeight() {
        return this.chocolates.stream()
                .map(Chocolate::getWeight)
                .reduce(0.0f, Float::sum)
                +
                this.sweets.stream()
                        .map(Sweet::getWeight)
                        .reduce(0.0f, Float::sum);
    }

    /**
     * @return Returns sum of prices of all Chocolates and Sweets
     */
    public float findTotalPrice() {
        return this.chocolates.stream()
                .map(Chocolate::getPrice)
                .reduce(0.0f, Float::sum)
                +
                this.sweets.stream()
                        .map(Sweet::getPrice)
                        .reduce(0.0f, Float::sum);

    }


    public ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    public void setChocolates(ArrayList<Chocolate> chocolates) {
        this.chocolates = chocolates;
    }

    public ArrayList<Sweet> getSweets() {
        return sweets;
    }

    public void setSweets(ArrayList<Sweet> sweets) {
        this.sweets = sweets;
    }
}