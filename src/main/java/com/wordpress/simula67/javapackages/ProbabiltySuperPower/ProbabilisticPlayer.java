package com.wordpress.simula67.javapackages.ProbabiltySuperPower;

import java.util.ListIterator;

public class ProbabilisticPlayer extends Player {
    ProbabilisticPlayer(GameMachine gameMachine) {
        super(gameMachine);
    }

    @Override
    public void playRound() {
        int i = 0;
        int choiceMaxExpectedBenefit = -1;
        double maxNetExpectedBenefit = -Double.MAX_VALUE;
        double expectedCost = 0;
        double expectedBenefit = 0;
        for (Choice choice : gameMachine.choices) {
            for( Value cost: choice.costs) {
                expectedCost += cost.probability * cost.value;
            }
            for( Value benefit: choice.benefits) {
                expectedBenefit += benefit.probability * benefit.value;
            }
            if((expectedBenefit - expectedCost) > maxNetExpectedBenefit)
            {
                maxNetExpectedBenefit = expectedBenefit - expectedCost;
                choiceMaxExpectedBenefit = i;
            }
            i++;
        }
        wallet += gameMachine.getPayoff(choiceMaxExpectedBenefit);
    }
}
