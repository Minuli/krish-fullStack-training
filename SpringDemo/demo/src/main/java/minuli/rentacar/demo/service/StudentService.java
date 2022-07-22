package minuli.rentacar.demo.service;

import minuli.rentacar.demo.model.Student;

public interface StudentService {
    Student save(Student student);

    Student fetchStudentById(int id);
}
