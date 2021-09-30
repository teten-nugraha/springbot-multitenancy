package id.ten.springmultitenancy.dao;

import id.ten.springmultitenancy.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface EmployeeDAO extends CrudRepository<Employee,Integer> {
    List<Employee> findAll();                           // fetch all Employee
}