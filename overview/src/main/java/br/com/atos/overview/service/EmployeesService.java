package br.com.atos.overview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import br.com.atos.overview.model.Employees;
import br.com.atos.overview.repository.EmployeesRepository;

@Service
public class EmployeesService {
	
	@Autowired
	private EmployeesRepository repository;
	
	
	public List<Employees> findAll() {
		return repository.findAll();
	}

}
