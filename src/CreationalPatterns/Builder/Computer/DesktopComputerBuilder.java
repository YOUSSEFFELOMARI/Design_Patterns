package CreationalPatterns.Builder.Computer;

public class DesktopComputerBuilder implements ComputerBuilder{
    private String cpu;
    private String memory;
    private String storage;
    private String graphicsCard;


    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu, memory, storage, graphicsCard);
    }
}
