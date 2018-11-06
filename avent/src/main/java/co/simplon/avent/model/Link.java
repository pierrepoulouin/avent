package co.simplon.avent.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Link {

	@Id // Designe que cette variable est un ID
	// Permet de génerer automatiquement la primary key id (auto-incrementation)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String url;
	// Distingue que la variable est une enumeration
	// EnumType.STRING permet de prendre le nom du type de l'enum au lieu de prendre
	// un chiffre
	@Enumerated(EnumType.STRING)
	private Topic topic;
	private LocalDate date;

	// Un user et un seul peut poster un link
	@OneToOne
	private User users;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

}
