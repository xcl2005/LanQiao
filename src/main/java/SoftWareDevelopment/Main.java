package SoftWareDevelopment;

// Main.java (测试用例)
public class Main {
    public static void main(String[] args) {
        LabClass lab = new LabClass();
        lab.setTime("Mon 12:00");
        lab.setRoom("R101");
        lab.setInstructor("Dr. Smith");

        lab.enrollStudent(new Student("Alice", "001", 3));
        lab.enrollStudent(new Student("Bob", "002", 4));
        lab.enrollStudent(new Student("Charlie", "003", 2));

        lab.printList();
        System.out.println("Average credits: " + lab.averageCredits());

        int idx = lab.findStudent("Bob");
        System.out.println("Bob index: " + idx);
        lab.showStudent(idx);

        lab.removeStudent(idx);
        lab.printListUsingWhile();
    }
}
