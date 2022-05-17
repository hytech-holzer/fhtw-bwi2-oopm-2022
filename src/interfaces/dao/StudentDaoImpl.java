package interfaces.dao;

import java.util.Arrays;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<String> getStudentList() {
        return Arrays.asList("Altin", "Raphphi", "Denise");
    }

    @Override
    public void createStudent(String student) {
        System.out.println(student + " wurde angelegt.");
    }
}
