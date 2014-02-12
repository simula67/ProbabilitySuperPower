package com.wordpress.simula67.javapackages.ProbabiltySuperPower;

import java.util.*;

public class GameMachine {
    public List<Choice> choices;
    Random randomGenerator;

    public double getPayoff(int i) {
        double total = 0;
        Choice currentChoice = choices.get(i);
        for( Value cost : currentChoice.costs )
        {
            double randomNumber = randomGenerator.nextInt(100) / 100.0;
            if (randomNumber < cost.probability)
            {
                total -= cost.value;
            }

        }
        for( Value benefit : currentChoice.benefits )
        {
            double randomNumber = randomGenerator.nextInt(100) / 100.0;
            if (randomNumber < benefit.probability)
            {
                total += benefit.value;
            }
        }
        return total;
    }
    GameMachine(List<Choice> choices)
    {
        this.randomGenerator = new Random();
        this.choices = new ArrayList<Choice>();
        this.choices.addAll(choices);
    }
}
