package zad_pomagalo_2_6_4;

public class Student implements Comparable<Student>{
	private String name;
	private double grade;
	
	
	
	
	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getGrade() {
		return grade;
	}




	public void setGrade(double grade) {
		this.grade = grade;
	}




	@Override
	public int compareTo(Student o) {
		int result = Double.compare(this.grade,o.getGrade());
		if(result == 0) {
			return this.name.compareTo(o.getName());
		}
		return result;
	}
}
