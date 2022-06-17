package service;

import org.apache.ibatis.annotations.Param;
import pojo.Student;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-06-16 14:34
 */

public interface StudentService {

    List<Student> getStudentList();

    Student getStudentByID(@Param("id") int id);

    List<Student> getStudentByName(@Param("name") String name);


    int addStudent(Student student);

    int deleteStudentByID(@Param("id") int id);

    int updateStudentByID(Student student);

}
