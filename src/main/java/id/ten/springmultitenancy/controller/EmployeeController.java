package id.ten.springmultitenancy.controller;

import id.ten.springmultitenancy.dao.EmployeeDAO;
import id.ten.springmultitenancy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "emploeeList")
    public List<Employee> emploeeList() {
        return employeeDAO.findAll();
    }
}