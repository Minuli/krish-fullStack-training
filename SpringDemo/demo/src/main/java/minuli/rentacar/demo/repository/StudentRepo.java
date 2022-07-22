package minuli.rentacar.demo.repository;

import minuli.rentacar.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepo extends JpaRepository<Student ,Integer> {



}
