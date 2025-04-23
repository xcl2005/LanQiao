package SoftWareDevelopment;

// Student.java
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private String id;
    private int credits;

    public Student(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // equals: 两个 Student 相等当且仅当 name 和 id 相同
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return Objects.equals(name, other.name)
                && Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    // toString: 返回可读的学生信息
    @Override
    public String toString() {
        return "Student{name='" + name + "', id='" + id + "', credits=" + credits + "}";
    }

    // print: 调用 toString
    public void print() {
        System.out.println(toString());
    }
}


