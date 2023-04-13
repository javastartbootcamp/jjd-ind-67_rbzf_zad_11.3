package pl.javastart.task;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive("HDD", "Seagate", "0000123", 500);
        try {
            Memory memory = new Memory("Tiger Shark", "X-Star", "D1MG21100505", 8, 1600, 60);
            Processor processor = new Processor("Intel Core i5-4590", "Intel", "SR1QJ", 3300, 50);
            Computer computer = new Computer(hardDrive, memory, processor);
            System.out.println(memory.toString());
            System.out.println(processor.toString());

            memory.overClock(100);
            System.out.println(memory.toString());
            processor.overClock(300);
            System.out.println(processor.toString());
        } catch (OverheatException e) {
            System.out.println(e.getMessage());
        }
    }
}
