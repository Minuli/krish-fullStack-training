package minuli.rentacar.demo.controller;

import minuli.rentacar.demo.model.Student;
import minuli.rentacar.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "",allowedHeaders ="")
@RestController
public class MainController {

    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting()
    {
        return "GET: Hello SpringBoot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2()
    {
        return "POST: Hello SpringBoot";
    }

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student)
    {
        return studentService.save(student);
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id)
    {
        Student student = studentService.fetchStudentById(id);

        if(student==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            return ResponseEntity.ok().body(student);
        }
    }

}
