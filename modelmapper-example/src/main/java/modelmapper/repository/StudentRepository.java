package modelmapper.repository;

import org.springframework.data.repository.CrudRepository;

import modelmapper.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	Student findByEmail(String email);
}
