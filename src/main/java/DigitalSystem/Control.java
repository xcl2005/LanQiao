package DigitalSystem;

public class Control    {
    public static void main(String[] args)
    {
        ArrayListClass arrayList = new ArrayListClass();
        Process  processA = new Process();
        processA.setProcessID(1);
        processA.setBurstTime(5);
        processA.setPriorityNum(1);
        arrayList.add(processA);

        Process  processB = new Process();
        processB.setProcessID(2);
        processB.setBurstTime(3);
        processB.setPriorityNum(2);
        arrayList.add(processB);


        Process  processC = new Process();
        processC.setProcessID(3);
        processC.setBurstTime(4);
        processB.setPriorityNum(3);
        arrayList.add(processC);


        Process  processD = new Process();
        processD.setProcessID(4);
        processD.setBurstTime(2);
        processB.setPriorityNum(4);
        arrayList.add(processD);

        Process  processE = new Process();
        processE.setProcessID(5);
        processE.setBurstTime(1);
        processB.setPriorityNum(5);
        arrayList.add(processE);

    }
}
