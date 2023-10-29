package CreationalPatterns.Builder.Computer;

public class BuilderPatternExample {
    public static void main(String[] args) {
        ComputerBuilder builder = new DesktopComputerBuilder();

        // Build a computer directly using the builder
        Computer computer = builder
                .setCpu("Intel Core i7")
                .setMemory("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("NVIDIA GeForce RTX 3080")
                .build();

        System.out.println("Built Computer: " + computer.toString());
    }
}
