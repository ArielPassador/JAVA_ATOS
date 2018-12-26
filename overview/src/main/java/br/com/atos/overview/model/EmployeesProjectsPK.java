package br.com.atos.overview.model;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class EmployeesProjectsPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "_employees")
	private Integer employees;
	
	@Column(name = "_projects")
	private Integer projects;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		result = prime * result + ((projects == null) ? 0 : projects.hashCode());
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
		EmployeesProjectsPK other = (EmployeesProjectsPK) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (projects == null) {
			if (other.projects != null)
				return false;
		} else if (!projects.equals(other.projects))
			return false;
		return true;
	}
	
	
	
}
