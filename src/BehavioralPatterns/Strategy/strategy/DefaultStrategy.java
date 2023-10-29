package BehavioralPatterns.Strategy.strategy;

public class DefaultStrategy implements Strategy{
    @Override
    public void apply() {
        System.out.println("..............");
        System.out.println("Default BehavioralPatterns.Strategy");
        System.out.println("..............");
    }
}
