/*-------------------- packages --------------------*/
package aplication;

/*-------------------- libraries --------------------*/
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*-------------------- modules --------------------*/
import domain.Person;

/*-------------------- class Program --------------------*/
public class Program {

	/*-------------------- main method --------------------*/
	public static void main(String[] args) {
		runProgram();
	}

	/*-------------------- functions --------------------*/
	private static void runProgram() {		
		EntityManagerFactory entity_manager_factory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entity_manager = entity_manager_factory.createEntityManager();
		
		entity_manager.getTransaction().begin();	// start connection with db
		entity_manager.getTransaction().commit();	// confirm changes
		
		example01(entity_manager);
		example02(entity_manager);
		displayMessageEndProgram();
		
		entity_manager.close();
		entity_manager_factory.close();
	}

	private static void example02(EntityManager entity_manager) {
//		Person person = instanceatePerson(2, "Joaquim", "joaquim@gmail.com"); // erro
		Person person = entity_manager.find(Person.class, 2);
		entity_manager.getTransaction().begin();	// start connection with db
		entity_manager.remove(person);
		entity_manager.getTransaction().commit();	// confirm changes
	}

	private static void example01(EntityManager entity_manager) {
		Person person_1 = entity_manager.find(Person.class, 2);	// recovering data
		person_1.printPerson();
	}

	private static Person instanceatePerson(Integer id, String name, String email) {
		return new Person(id, name, email);
	}

	private static void displayMessageEndProgram() {
		System.out.println("\n---> fim do programa <---");
	}
}
