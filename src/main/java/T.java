import mapper.StudentMapper;
import org.junit.Test;
import pojo.Student;
import service.StudentService;
import utils.ApplicationContextUtils;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-06-15 9:53
 */

public class T {

    @Test
    public void t() {
        StudentMapper studentMapper = ApplicationContextUtils.getApplicationContext().getBean("studentMapper", StudentMapper.class);

//        Student studentByID = studentMapper.getStudentByID(1);
//        System.out.println(studentByID);
//
//        List<Student> wyl = studentMapper.getStudentByName("wyl");
//        System.out.println(wyl);

//        int i = studentMapper.addStudent(Student.builder().name("bsy").sex("女").build());
//        System.out.println(i);

//        int i1 = studentMapper.deleteStudentByID(3);
//        System.out.println(i1);

//        int bsywyl = studentMapper.updateStudentByID(Student.builder().id(4).name("bsywyl").build());
//        int bsywyl = studentMapper.updateStudentByID(Student.builder().id(4).sex("男").build());
//        System.out.println(bsywyl);

//        List<Student> studentList = studentMapper.getStudentList();
//        System.out.println(studentList);


        StudentService studentService = ApplicationContextUtils.getApplicationContext().getBean("studentService", StudentService.class);

//        Student studentByID = studentService.getStudentByID(1);
//        System.out.println(studentByID);

//        List<Student> wyl = studentService.getStudentByName("wyl");
//        System.out.println(wyl);

//        int i = studentService.addStudent(Student.builder().name("bsy").sex("女").build());
//        System.out.println(i);

//        int i1 = studentService.deleteStudentByID(4);
//        System.out.println(i1);

//        int bsywyl = studentService.updateStudentByID(Student.builder().id(5).name("bsywyl").build());
//        int bsywyl = studentService.updateStudentByID(Student.builder().id(5).sex("男").build());
//        System.out.println(bsywyl);

//        List<Student> studentList = studentService.getStudentList();
//        System.out.println(studentList);

    }
}
