package DigitalSystem;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    List<Process> processes = new ArrayList<>();
     public void add(Process process) {
        this.processes.add(process);
     }
     public void remove(Process process) {
        this.processes.remove(process);
     }

}
