package SoftWareDevelopment;

import java.util.ArrayList;

public class LabClass {
    private String timeAndDay;
    private String room;
    private String instructor;
    private ArrayList<Student> students;

    // 无参构造函数
    public LabClass() {
        this.timeAndDay = "unknown";
        this.room = "unknown";
        this.instructor = "unknown";
        this.students = new ArrayList<>();
    }

    // Setter 和 Getter
    public void setTime(String timeAndDay) {
        this.timeAndDay = timeAndDay;
    }

    public String getTime() {
        return timeAndDay;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    // 注册学生
    public void enrollStudent(Student newStudent) {
        students.add(newStudent);
    }

    // 返回注册学生人数
    public int numberOfStudents() {
        return students.size();
    }

    // 打印班级列表（for-each）
    public void printList() {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + " room: " + room);
        System.out.println("Class list:");
        for (Student student : students) {
            student.print();
        }
        System.out.println("Number of students: " + numberOfStudents());
    }

    // 使用 while 循环打印班级列表
    public void printListUsingWhile() {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + " room: " + room);
        System.out.println("Class list (while):");
        int i = 0;
        while (i < students.size()) {
            students.get(i).print();
            i++;
        }
        System.out.println("Number of students: " + numberOfStudents());
    }

    // 根据索引移除学生
    public void removeStudent(int studentEntry) {
        if (studentEntry >= 0 && studentEntry < students.size()) {
            students.remove(studentEntry);
        } else {
            System.err.println("Index out of bounds: " + studentEntry);
        }
    }

    // 计算平均学分
    public double averageCredits() {
        if (students.isEmpty()) return 0.0;
        int sum = 0;
        for (Student s : students) {
            sum += s.getCredits();
        }
        return (double) sum / students.size();
    }

    // 查找指定姓名的学生，返回首次出现的索引，否则返回 -1
    public int findStudent(String targetName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(targetName)) {
                return i;
            }
        }
        return -1;
    }

    // 显示指定索引的学生
    public void showStudent(int studentEntry) {
        if (studentEntry >= 0 && studentEntry < students.size()) {
            students.get(studentEntry).print();
        } else {
            System.err.println("Index out of bounds: " + studentEntry);
        }
    }
}
