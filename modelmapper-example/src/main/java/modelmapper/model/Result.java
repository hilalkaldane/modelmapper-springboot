package modelmapper.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "result_info")
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getComputer_science() {
		return computer_science;
	}

	public void setComputer_science(int computer_science) {
		this.computer_science = computer_science;
	}

	@JoinColumn(name = "student")
	@ManyToOne
	private Student student;

	@NotNull
	private int english;

	@NotNull
	private int maths;

	@NotNull
	private int science;

	@NotNull
	private int computer_science;

	public Result(Student student, @NotNull int english, @NotNull int maths, @NotNull int science,
			@NotNull int computer_science) {
		super();
		this.student = student;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.computer_science = computer_science;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

}
