/*-------------------- packages --------------------*/
package domain;

/*-------------------- libraries --------------------*/
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*-------------------- class Person --------------------*/
@Entity
public class Person implements Serializable {

	/*-------------------- attributes --------------------*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;

	/*-------------------- constructors --------------------*/
	public Person() {
	}
	
	public Person(Integer id, String name, String email) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}

	/*-------------------- getters and setters --------------------*/
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*-------------------- methods --------------------*/
	@Override
	public String toString() {
		return "Pessoa\n" +
				String.format("Id .....: %d%n", this.getId()) +
				String.format("Nome ...: %s%n", this.getName()) +
				String.format("Email ..: %s%n", this.getEmail());
	}
	
	public void printPerson() {
		System.out.println(toString());
	}
}
