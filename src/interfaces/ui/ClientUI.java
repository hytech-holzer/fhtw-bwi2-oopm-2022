package interfaces.ui;

import interfaces.service.StudentService;
import interfaces.service.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ClientUI {

    private StudentService studentService;

    public void testNewStudent() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        studentService.createStudent(name);
    }

    public void testGetStudentList() {
        List<String> studenten = studentService.getStudentList();
        studenten.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new ClientUI().testGetStudentList();
        new ClientUI().testNewStudent();
    }

    {
        studentService = new StudentServiceImpl();
    }

}
