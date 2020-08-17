package com.example.atividade;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employees",path = "employees")
public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Long>  {
	
}
