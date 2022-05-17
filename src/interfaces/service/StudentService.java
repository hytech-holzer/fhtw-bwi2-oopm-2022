package interfaces.service;

import java.util.List;

public interface StudentService {

    List<String> getStudentList();

    void createStudent(String student);


}
