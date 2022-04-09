package Lesson4_3_1;

import java.util.Objects;

public class Student {
    String name;
    String group;
    String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
