package com.wordpress.simula67.javapackages.ProbabiltySuperPower;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Value weightedCost1Choice1 = new Value(0.73,100);
        Value weightedCost2Choice1 = new Value(0.23,200);

        Value weightedBenefit1Choice1 = new Value(0.34,80);
        Value weightedBenefit2Choice1 = new Value(0.45,20);

        Value weightedCost1Choice2 = new Value(0.12,10);
        Value weightedCost2Choice2 = new Value(0.56,22);

        Value weightedBenefit1Choice2 = new Value(0.75,80);
        Value weightedBenefit2Choice2 = new Value(0.88,90);

        Choice choice1 = new Choice();
        choice1.costs.add(weightedCost1Choice1);
        choice1.costs.add(weightedCost2Choice1);
        choice1.benefits.add(weightedBenefit1Choice1);
        choice1.benefits.add(weightedBenefit2Choice1);

        Choice choice2 = new Choice();
        choice2.costs.add(weightedCost1Choice2);
        choice2.costs.add(weightedCost2Choice2);
        choice2.benefits.add(weightedBenefit1Choice2);
        choice2.benefits.add(weightedBenefit2Choice2);

        List<Choice> choices = new ArrayList<Choice>();
        choices.add(choice1);
        choices.add(choice2);

        GameMachine gameMachine = new GameMachine(choices);
        NaivePlayer naivePlayer = new NaivePlayer(gameMachine);
        ProbabilisticPlayer probabilisticPlayer = new ProbabilisticPlayer(gameMachine);
        for (int i = 0; i < 5; i++)
        {
            naivePlayer.playRound();
            probabilisticPlayer.playRound();
        }

        System.out.println("Naive player wallet : " + naivePlayer.wallet);
        System.out.println("Probabilistic player wallet : " + probabilisticPlayer.wallet);

    }
}
