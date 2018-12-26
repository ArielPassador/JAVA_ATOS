package br.com.atos.overview.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "role")
	private String role;
	@Column
	private String salary;
	@Column
	private Integer gcm;
	
	@ManyToOne
	@JoinColumn(name = "_projects")
	private Projects projects;
	
	@ManyToOne
	@JoinColumn(name = "_skill")
	private Skills skill;
	
	@ManyToOne
	@JoinColumn(name = "_certification")
	private Certification certification;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Employees() {
		
	}
	
	public Integer getid() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Integer getGcm() {
		return gcm;
	}

	public void setGcm(Integer gcm) {
		this.gcm = gcm;
	}

	public Projects getProjects() {
		return projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public Skills getSkill() {
		return skill;
	}

	public void setSkill(Skills skill) {
		this.skill = skill;
	}
	
	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object getId() {
		return null;
	}
	
}

