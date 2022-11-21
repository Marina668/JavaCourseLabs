package mypack_t_8_14;

public class RAM {
    int id;
    OperatingSystem operating_system;
    Processor processor;
    int memory;


    public RAM(int id, OperatingSystem operating_system, Processor processor, int memory) {
        this.id = id;
        this.operating_system = operating_system;
        this.processor = processor;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Operating Memory{" +
                "operating system=" + operating_system +
                ", processor=" + processor +
                ", memory='" + memory +
                '}';
    }



    public OperatingSystem getOperatingSystem() {
        return operating_system;
    }

    public void setOperatingSystem(OperatingSystem operating_system) {
        this.operating_system = operating_system;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
