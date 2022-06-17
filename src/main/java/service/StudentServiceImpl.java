package service;

import mapper.StudentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pojo.Student;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-06-16 14:35
 */

@Service("studentService")
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = 10)

public class StudentServiceImpl implements StudentService{

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public Student getStudentByID(int id) {
        return studentMapper.getStudentByID(id);
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return studentMapper.getStudentByName(name);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudentByID(int id) {
        return studentMapper.deleteStudentByID(id);
    }

    @Override
    public int updateStudentByID(Student student) {
        return studentMapper.updateStudentByID(student);
    }

}
