package modelmapper.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelmapper.dto.ResultDto;
import modelmapper.dto.ResultPropertyMap;
import modelmapper.model.Result;
import modelmapper.model.Student;
import modelmapper.repository.ResultRepository;
import modelmapper.repository.StudentRepository;

@RestController
@RequestMapping("result")
public class ResultController {
	@Autowired
	ResultRepository resultRepository;

	@Autowired
	StudentRepository studentRepository;

	@GetMapping("filldata")
	public String filldata() {
		// First User with Multiple Record in Result Table
		Student student = new Student("Hilal Kaldane", "hilalkaldane@gmail.com", "India");
		studentRepository.save(student);
		Result result1OfStudent = new Result(student, 88, 99, 92, 95);
		resultRepository.save(result1OfStudent);
		Result result2OfStudent = new Result(student, 78, 82, 93, 91);
		resultRepository.save(result2OfStudent);

		// Second user with single record in Result Table
		Student student2 = new Student("Alice Bob", "alicebob@gmail.com", "India");
		studentRepository.save(student2);
		Result result1OfStudent2 = new Result(student2, 83, 59, 12, 45);
		resultRepository.save(result1OfStudent2);
		return "Data Filled";
	}

	@GetMapping("getallresult")
	public Iterable<ResultDto> getAllResults() {
		Iterable<Result> Result = (Iterable<Result>) resultRepository.findAll();
		ArrayList<ResultDto> ResultDto = new ArrayList<ResultDto>();
		Iterator<Result> ResultIterator = Result.iterator();
		while (ResultIterator.hasNext()) {
			ModelMapper modelMapper = new ModelMapper();
			ResultDto.add(modelMapper.addMappings(ResultPropertyMap.property_map).map(ResultIterator.next()));
		}
		return (Iterable<ResultDto>) ResultDto;
	}

	@GetMapping("getresult/{email}")
	public ResultDto getResult(@PathVariable String email) {
		Student student = studentRepository.findByEmail(email);
		Result result = resultRepository.findByStudent(student);
		ModelMapper modelMapper = new ModelMapper();
		ResultDto resultDto = modelMapper.addMappings(ResultPropertyMap.property_map).map(result);
		return resultDto;
	}
}
