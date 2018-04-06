package modelmapper.repository;

import org.springframework.data.repository.CrudRepository;

import modelmapper.model.Result;
import modelmapper.model.Student;

public interface ResultRepository extends CrudRepository<Result, Integer> {

	Result findByStudent(Student s);
}
