package mypack_t_8_14;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static class Storage{
        List<OperatingSystem> operating_systems = new ArrayList<>();
        List<Processor> processors = new ArrayList<>();
        List<RAM> rams = new ArrayList<>();

        OperatingSystem getOperatingSystem(int operation_system_id){
            boolean found = false;
            for(OperatingSystem operating_system: this.operating_systems){
                if(operating_system.id == operation_system_id){
                    return operating_system;
                }
            }

            if (!found) {
                throw new OperatingSystemException(operation_system_id);
            }

            return null;
        }

        Processor getProcessor(int processor_id){
            boolean found = false;

            for(Processor processor: this.processors){
                if(processor.id == processor_id){
                    return processor;
                }
            }

            if (!found) {
                throw new ProcessorException(processor_id);
            }

            return null;
        }

        RAM getRAM(int ram_id){
            boolean found = false;

            for(RAM ram: this.rams){
                if(ram.id == ram_id){
                    return ram;
                }
            }
            if (!found) {
                throw new RAMException(ram_id);
            }

            return null;
        }

        void addOperatingSystem(OperatingSystem operating_system){
            this.operating_systems.add(operating_system);
        }

        void addProcessor(Processor processor){
            this.processors.add(processor);
        }

        void addRAM(RAM ram){
            this.rams.add(ram);
        }

    }

    String device_id;
    String product_id;
    int release_year;
    Storage storage;

    public Computer(String device_id, String product_id) {
        this.device_id = device_id;
        this.product_id = product_id;
        this.storage = new Computer.Storage();
    }

    public static void main(String args[]){
        OperatingSystem operating_system1 = new OperatingSystem(1,  64);
        Processor processor1 = new Processor(1, operating_system1, 12, 2, 32, 2345);
        RAM ram1 = new RAM(1, operating_system1, processor1, 8);

        Computer computer = new Computer("EC45F5EA-8EAA-2017-BD05-DD02F237780E", "00440-70000-00000-AA346");
        computer.storage.addOperatingSystem(operating_system1);
        computer.storage.addProcessor(processor1);
        computer.storage.addRAM(ram1);

        System.out.println("\nComputer you are looking for: ");
        RAM new_ram = computer.storage.getRAM(1);
        System.out.println(new_ram);

        System.out.println("\nEverything seems okay, but... \n");

        RAM new_ram2 = computer.storage.getRAM(3);
        System.out.println(new_ram2);

    }

}
