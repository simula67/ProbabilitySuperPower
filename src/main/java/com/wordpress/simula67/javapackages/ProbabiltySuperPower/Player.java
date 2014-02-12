package com.wordpress.simula67.javapackages.ProbabiltySuperPower;

public abstract class Player {
    Player(GameMachine gameMachine)
    {
        this.gameMachine = gameMachine;
        wallet = 0.0;
    }

    public double wallet;
    public GameMachine gameMachine;

    public abstract void playRound();
}
