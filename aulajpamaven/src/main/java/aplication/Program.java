/*-------------------- packages --------------------*/
package aplication;

/*-------------------- modules --------------------*/
import domain.Person;

/*-------------------- class Program --------------------*/
public class Program {

	/*-------------------- main method --------------------*/
	public static void main(String[] args) {
		runProgram();
	}

	private static void runProgram() {
		Person person_1 = instanceatePerson(generateId(), "Carlos", "carlos@gmail.com");
		Person person_2 = instanceatePerson(generateId(), "Joaquim", "joaquim@gmail.com");
		Person person_3 = instanceatePerson(generateId(), "Ana", "ana@gmail.com");
		
		person_1.printPerson();
		person_2.printPerson();
		person_3.printPerson();
	}

	private static Integer generateId() {
		return (int)(Math.random() * 1000);
	}

	private static Person instanceatePerson(Integer id, String name, String email) {
		return new Person(id, name, email);
	}
}
