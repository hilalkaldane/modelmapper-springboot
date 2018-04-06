package modelmapper.dto;

public class ResultDto {
	private Integer Result_Id;
	private Integer Student_Id;
	private String Student_Name;
	private int English;
	private int Maths;
	private int Science;
	private int Computer_Science;
	public Integer getResult_Id() {
		return Result_Id;
	}
	public void setResult_Id(Integer result_Id) {
		Result_Id = result_Id;
	}
	public Integer getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(Integer student_Id) {
		Student_Id = student_Id;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getComputer_Science() {
		return Computer_Science;
	}
	public void setComputer_Science(int computer_Science) {
		Computer_Science = computer_Science;
	}
	


}
