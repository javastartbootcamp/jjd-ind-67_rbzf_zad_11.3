package pl.javastart.task;

class Computer {
    private HardDrive hardDrive;
    private Memory memory;
    private Processor processor;

    public Computer(HardDrive hardDrive, Memory memory, Processor processor) {
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.processor = processor;
    }
}
