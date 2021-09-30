package id.ten.springmultitenancy.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id                                                     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // auto increment
    @Column(name = "employeeId")
    private int employeeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeRole")
    private String employeeRole;

}