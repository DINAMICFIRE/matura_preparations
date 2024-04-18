package other_PhysicsExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentsCount = Integer.parseInt(scan.nextLine());
		List<Student> students = new ArrayList<>();
		
		for (int i = 0; i < studentsCount; i++) {
			String name = scan.nextLine();
			int points = Integer.parseInt(scan.nextLine());
			
			students.add(new Student(name,points));
		}
		long countStudents = 
				students
				.stream()
				.map(el -> el.getPoints())
				.filter(el -> el >= 0 && el < 101)
				.count();
				
		System.out.println("Брой на студентите, явили се на изпита: " + countStudents);
		
		OptionalDouble average = 
				students
				.stream()
				.mapToInt(el -> el.getPoints())
				.filter(el -> el >= 0 && el < 101)
				.average();			
		System.out.printf("Среден резултат от изпита: %.2f%n",average.getAsDouble());
		
		students.sort((el1,el2) -> el1.compareTo(el2));
		students.forEach(System.out::println);
	}
}
