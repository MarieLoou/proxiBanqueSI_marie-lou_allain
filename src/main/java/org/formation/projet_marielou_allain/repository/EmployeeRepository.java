package org.formation.projet_marielou_allain.repository;

import org.formation.projet_marielou_allain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
