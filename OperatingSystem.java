package mypack_t_8_14;

public class OperatingSystem {
    int id;
    int bitness;

    public OperatingSystem(int id, int bitness) {
        this.id = id;
        this.bitness = bitness;
    }

    @Override
    public String toString() {
        return "Operating System{" +
                "bitness='" + bitness + '}';
    }

    public int getBitness() {
        return bitness;
    }

    public void setBitness(int bitness) {
        this.bitness = bitness;
    }

}
