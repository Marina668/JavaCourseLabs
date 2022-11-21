package mypack_t_8_14;

public class Processor {
    int id;
    OperatingSystem operating_system;
    int frequency;
    int number_of_cores;
    int cache_memory;
    long items_number;

    public Processor(int id, OperatingSystem operating_system, int frequency, int number_of_cores, int cache_memory, long items_number) {
        this.id = id;
        this.operating_system = operating_system;
        this.frequency = frequency;
        this.number_of_cores = number_of_cores;
        this.cache_memory = cache_memory;
        this.items_number = items_number;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "operating_system=" + operating_system +
                ", frequency='" + frequency + '\'' +
                ", number of cores='" + number_of_cores + '\'' +
                ", cache memory='" + cache_memory + '\'' +
                ", items_number=" + items_number +
                '}';
    }

    public OperatingSystem getOperatingSystem() {
        return operating_system;
    }

    public void setOperatingSystem(OperatingSystem operating_system) {
        this.operating_system = operating_system;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getNumber_of_cores() {
        return number_of_cores;
    }

    public void setNumber_of_cores(int number_of_cores) {
        this.number_of_cores = number_of_cores;
    }

    public int getCache_memory() {
        return cache_memory;
    }

    public void setCache_memory(int cache_memory) {
        this.cache_memory = cache_memory;
    }

    public long getItems_number() {
        return items_number;
    }

    public void setItems_number(long items_number) {
        this.items_number = items_number;
    }
}
