package minuli.rentacar.demo.service;

import minuli.rentacar.demo.model.Student;
import minuli.rentacar.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public Student fetchStudentById(int id)
    {
        //this is a business logic so it is in the @Service
       Optional<Student> student = studentRepo.findById(id);
       if(student.isPresent())
       {
           return student.get();
       }
       return null;
    }

}
