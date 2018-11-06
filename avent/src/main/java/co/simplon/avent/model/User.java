package co.simplon.avent.model;

import java.util.List;

//JPA = Java Persistence API
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//Definir à notre bdd que User est une entité
@Entity
public class User {
	@Id // Designe que cette variable est un ID
	// Permet de génerer automatiquement la primary key id (auto-incrementation)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;
	private String lastname;
	private String email;

	// Il y aura un ou plusieurs links postés par un user
	@OneToMany
	private List<Link> links;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
