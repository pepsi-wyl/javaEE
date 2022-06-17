package controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.Student;
import service.StudentService;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-06-16 14:54
 */

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/allStudent")
    public String queryBookList(Model model) {
        List<Student> studentList = studentService.getStudentList();
        model.addAttribute("studentList", studentList);
        model.addAttribute("queryName", "请输入要查询学生的姓名");
        return "jsp/main";
    }

    @RequestMapping(value = "/queryStudent", method = RequestMethod.POST)
    public String queryBookByBookName(String queryStudentName, Model model) {
        List<Student> studentByNameList = studentService.getStudentByName(queryStudentName.trim());
        model.addAttribute("studentList", studentByNameList);
        if (queryStudentName == "") model.addAttribute("queryName", "请输入要查询的书籍名称");
        else model.addAttribute("queryName", queryStudentName);
        return "jsp/main";
    }

    @RequestMapping(value = "/deleteStudent/{id}")
    public String delete(@PathVariable int id) {
        System.out.println(studentService.deleteStudentByID(id) > 0 ? "删除成功!" : "删除失败!");
        return "redirect:/student/allStudent";
    }

    @RequestMapping(value = "/toAddStudent")
    public String toAddBook() {
        return "jsp/toAddStudent";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(Student student) {
        studentService.addStudent(student);
        return "redirect:/student/allStudent";
    }

    @RequestMapping(value = "/toUpdatePager")
    public String toUpdatePager(@Param("id") int id, Model model) {
        Student studentByID = studentService.getStudentByID(id);
        model.addAttribute("student", studentByID);
        return "jsp/toUpdateStudent";
    }

    @RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
    public String updateStudent(Student student) {
        System.out.println(studentService.updateStudentByID(student) > 0 ? "修改成功!" : "修改失败!");
        return "redirect:/student/allStudent";
    }

}
