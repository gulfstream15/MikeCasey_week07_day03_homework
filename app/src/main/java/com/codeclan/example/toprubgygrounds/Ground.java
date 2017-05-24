package com.codeclan.example.toprubgygrounds;

/**
 * Created by user on 24/05/2017.
 */

public class Ground {

    private int ranking;
    private String name;
    private int capacity;

    public Ground(Integer ranking, String name, Integer capacity) {
        this.ranking = ranking;
        this.name = name;
        this.capacity = capacity;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

}