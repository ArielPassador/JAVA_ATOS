package br.com.atos.overview.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.atos.overview.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
	
	@Query(value = "select name, role, skill from Employees e")
	List<Employees> findByName(String name, String role, String skill);
}
