package org.formation.projet_marielou_allain.service;

import org.formation.projet_marielou_allain.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getEmployees ();

    Employee createEmployee(Employee agency);

    Optional<Employee> getEmployee(Long id);

    Optional<Employee> updateEmployee(Long id, Employee newData);
}
