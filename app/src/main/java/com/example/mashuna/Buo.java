package com.example.mashuna;

public class Buo {
    private String name;
    private String buoDescription;
    private int buoResource;
    private String populationSize;

    // конструктор
    public Buo(String name, String buoDescription, int buoResource, String populationSize) {
        this.name = name;
        this.buoDescription = buoDescription;
        this.buoResource = buoResource;
        this.populationSize = populationSize;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuoDescription() {
        return buoDescription;
    }

    public void setBuoDescription(String buoDescription) {
        this.buoDescription = buoDescription;
    }

    public int getBuoResource() {
        return buoResource;
    }

    public void setBuoResource(int buoResource) {
        this.buoResource = buoResource;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}
