package zad_pomagalo;

import java.util.Scanner;

public class one_two_twentytwo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int grade = Integer.parseInt(scan.nextLine());
	System.out.println(getGrade(grade));
}
private static String getGrade(int grade) {
	String gradeOutput = "Invalid input";
	
	switch(grade) {
	case 2:
		gradeOutput = "slab";
		break;
	case 3:
		gradeOutput = "sreden";
		break;
	case 4:
		gradeOutput = "dobur";
		break;
	case 5:
		gradeOutput = "mn dobur";
		break;
	case 6:
		gradeOutput = "otlichen";
		break;
	}

	return gradeOutput;	
}
}
