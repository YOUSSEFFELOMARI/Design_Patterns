package BehavioralPatterns.Strategy.Contexte;

import BehavioralPatterns.Strategy.strategy.DefaultStrategy;
import BehavioralPatterns.Strategy.strategy.Strategy;

public class Context {
    private Strategy strategy=new DefaultStrategy();

    public void applyStrategy(){
        System.out.println("..............");
        strategy.apply();
        System.out.println("..............");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
