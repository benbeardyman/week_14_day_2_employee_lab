package com.codeclan.example.employeeService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.nashorn.internal.ir.Assignment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "employeeNumber")
    private int employeeNumber;

    @JsonIgnoreProperties({"project", "employee"})
    @OneToMany(mappedBy = "employee")
    @Column(name = "briefs")
    private List<Brief> briefs;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int employeeNumber, Brief a_brief) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.briefs = new ArrayList<Brief>();
        this.briefs.add(a_brief);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Brief> getBriefs() {
        return briefs;
    }

    public void setBriefs(ArrayList<Brief> briefs) {
        this.briefs = briefs;
    }

    public void addBrief(Brief brief) {
        this.briefs.add(brief);
    }
}
