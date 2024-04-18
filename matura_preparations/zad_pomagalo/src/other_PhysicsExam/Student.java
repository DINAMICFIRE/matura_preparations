package other_PhysicsExam;

public class Student implements Comparable<Student>{
	private String name;
	private int points;
	
	
	
	
	
	
	public Student(String name, int points) {
		setName(name);
		setPoints(points);
	}

	





	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getPoints() {
		return points;
	}






	public void setPoints(int points) {
		if(points < 0 || points > 100) {
			this.points = -1;
		}else {
			this.points = points;
		}
	}






	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.getPoints(), o.getPoints());
	}
	
	
}
