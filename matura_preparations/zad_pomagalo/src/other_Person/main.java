package other_Person;

public class main {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("Peter","Petrov",10);
		people[1] = new Person("George","Georgiev",20);
		people[2] = new Person("Nigg","Er",30);
		
		for (Person person : people) {
			System.out.println(person.getInfo());
		}
	}
}
