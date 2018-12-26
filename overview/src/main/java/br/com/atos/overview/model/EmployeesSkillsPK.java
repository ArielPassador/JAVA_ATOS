package br.com.atos.overview.model;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class EmployeesSkillsPK implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Column(name = "_employees")
	private Integer employees;
	
	@Column(name = "_skills")
	private Integer skills;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
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
		EmployeesSkillsPK other = (EmployeesSkillsPK) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}
	
	

}
