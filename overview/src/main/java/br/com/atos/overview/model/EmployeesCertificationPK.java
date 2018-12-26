package br.com.atos.overview.model;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class EmployeesCertificationPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "_employees")
	private Integer employees;
	
	@Column(name = "_certification")
	private Integer certification;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certification == null) ? 0 : certification.hashCode());
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
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
		EmployeesCertificationPK other = (EmployeesCertificationPK) obj;
		if (certification == null) {
			if (other.certification != null)
				return false;
		} else if (!certification.equals(other.certification))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}
	
	

}
