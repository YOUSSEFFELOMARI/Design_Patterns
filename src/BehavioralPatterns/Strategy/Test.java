package BehavioralPatterns.Strategy;

import BehavioralPatterns.Strategy.Contexte.Context;
import BehavioralPatterns.Strategy.strategy.StrategyImp1;
import BehavioralPatterns.Strategy.strategy.StrategyImp2;

class Test {
    public static void main(String[] args) {

        Context context=new Context();
        context.applyStrategy();
        context.setStrategy(new StrategyImp1());
        context.applyStrategy();
        context.setStrategy(new StrategyImp2());
        context.applyStrategy();
    }

}
