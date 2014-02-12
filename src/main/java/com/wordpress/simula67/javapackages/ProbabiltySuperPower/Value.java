package com.wordpress.simula67.javapackages.ProbabiltySuperPower;

public class Value {
    public double value;
    public double probability;

    public Value(double probability, double value) throws IllegalArgumentException {
        if (probability > 1)
        {
            throw new IllegalArgumentException("Value of probability must be less than 1, instead was " + probability);
        }
        this.probability = probability;
        this.value = value;
    }
}
