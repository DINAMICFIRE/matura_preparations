package zad_pomagalo_2_6_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String studentClass = scan.nextLine();
		try {
			Scanner inputFile = new Scanner(new File("src/zad_pomagalo_2_6_4/" + studentClass));
			List<Student> students = new ArrayList<>();
			while(inputFile.hasNext()) {
				String info = inputFile.nextLine();
				String name = info.split(" - ")[0];
				Double grade = Double.parseDouble(info.split(" - ")[1]);
				students.add(new Student(name,grade));
			}
			students.sort((el2,el1) -> el1.compareTo(el2));
			FileWriter writer = new FileWriter(new File("src/zad_pomagalo_2_6_4/" + studentClass + "_sorted"));
			students.forEach(el -> {
				try {
					writer.write(String.format("%s -> %.2f%n",el.getName(),el.getGrade()));
				} catch (IOException e) {
					System.out.println("smt Went wrong!");
				}
			});
			writer.flush();
			writer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("invalid class");
		}
	}
}
