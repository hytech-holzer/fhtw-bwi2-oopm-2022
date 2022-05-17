package interfaces.dao;

import java.util.List;

public interface StudentDao {

    String PUBLIC_STRING = "abc";

    List<String> getStudentList();

    void createStudent(String student);

}
