package interfaces.service;

import interfaces.dao.StudentDao;
import interfaces.dao.StudentDaoImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Override
    public List<String> getStudentList() {
        List<String> studenten = studentDao.getStudentList();
        // calculations, orderings...
        return studenten;
    }

    @Override
    public void createStudent(String student) {
        // validations....
        studentDao.createStudent(student);
    }

    {
        studentDao = new StudentDaoImpl();
    }
}
