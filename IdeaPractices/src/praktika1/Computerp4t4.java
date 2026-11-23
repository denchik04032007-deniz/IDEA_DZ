package praktika1;

enum Brand {
    APPLE, DELL, HP, LENOVO, ASUS
}

class Processor {
    private String model;
    private int cores;

    public Processor(String model, int cores) {
        this.model = model;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + " (" + cores + " ядер)";
    }
}

class Memory {
    private int ram;
    private int storage;

    public Memory(int ram, int storage) {
        this.ram = ram;
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "Память: " + ram + "ГБ RAM, " + storage + "ГБ SSD";
    }
}

class Monitor {
    private int size; // диагональ в дюймах
    private String resolution;

    public Monitor(int size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Монитор: " + size + "\" (" + resolution + ")";
    }
}

class Computer1 {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer1(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "--- Компьютер " + brand + " ---\n" + processor + "\n" + memory + "\n" + monitor;
    }
}

public class Computerp4t4 {
    public static void main(String[] args) {
        Processor cpu = new Processor("Intel Core i7", 8);
        Memory ram = new Memory(16, 512);
        Monitor screen = new Monitor(27, "2K");

        Computer1 myPc = new Computer1(Brand.LENOVO, cpu, ram, screen);

        System.out.println(myPc);
    }
}
