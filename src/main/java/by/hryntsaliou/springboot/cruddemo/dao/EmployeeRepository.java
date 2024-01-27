package by.hryntsaliou.springboot.cruddemo.dao;

import by.hryntsaliou.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
