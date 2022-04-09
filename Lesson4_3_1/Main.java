package Lesson4_3_1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        System.out.println("Введите информацию о студенте: \""+"ФИО, Номер группы, номер студентечского билета. ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\").");
            String nameInfo = scan.nextLine();
            String groupInfo = scan.nextLine();
            String studentIdInfo = scan.nextLine();
            students.add(new Student(nameInfo,groupInfo,studentIdInfo));
            String exit = scan.nextLine();
            if("end".equals(exit)) {
                for (Student student: students) {
                    System.out.println(student + "\nРабота программы завершена.");
                    break;
                }
            }
        }
    }
}
