package mypack_t_8_14;

public class ComputerException extends ArithmeticException {
    private String message;

    ComputerException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}

class OperatingSystemException extends ArithmeticException {
    private final int operating_system_id;

    OperatingSystemException(int operating_system_id1) {
        this.operating_system_id = operating_system_id1;
    }

    @Override
    public String toString() {
        return String.format("No operating system with such id: %d", this.operating_system_id);
    }
}

class ProcessorException extends ArithmeticException {
    private final int processor_id;

    ProcessorException(int processor_id1) {
        this.processor_id = processor_id1;
    }

    @Override
    public String toString() {
        return String.format("No processor with such id: %d", this.processor_id);
    }
}

class RAMException extends ArithmeticException {
    private int ram_id;

    RAMException(int ram_id) {
        this.ram_id = ram_id;
    }

    @Override
    public String toString() {
        return String.format("No RAM with such id: %d", this.ram_id);
    }
}

