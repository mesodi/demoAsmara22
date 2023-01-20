package Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {


    private final StudentService studentServie;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentServie = studentService;
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentServie.getStudents();
    }
}




