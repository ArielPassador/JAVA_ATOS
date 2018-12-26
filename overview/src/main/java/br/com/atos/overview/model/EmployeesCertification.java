package br.com.atos.overview.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "employees_certification")
public class EmployeesCertification implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private EmployeesCertificationPK id;
	
	@ManyToOne
	@JoinColumn(name = "_employees", insertable = false , updatable = false)
	private Employees employees;
	
	@ManyToOne
	@JoinColumn(name = "_certification", insertable = false, updatable = false)
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
		EmployeesCertification other = (EmployeesCertification) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
		
}
