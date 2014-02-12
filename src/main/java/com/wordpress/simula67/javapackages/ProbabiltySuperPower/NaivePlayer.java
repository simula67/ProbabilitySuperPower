package com.wordpress.simula67.javapackages.ProbabiltySuperPower;

import java.util.Random;

public class NaivePlayer extends Player {
    Random randomGenerator;
    NaivePlayer(GameMachine gameMachine)
    {
        super(gameMachine);
        this.randomGenerator = new Random();
    }
    @Override
    public void playRound() {
        int totalChoices = gameMachine.choices.size();
        wallet += gameMachine.getPayoff(randomGenerator.nextInt(totalChoices));
    }
}
