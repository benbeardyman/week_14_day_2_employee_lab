package com.codeclan.example.employeeService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    @JsonIgnoreProperties({"project", "employee"})
    @OneToMany(mappedBy = "project")
    @Column(name = "briefs")
    private List<Brief> briefs;

    public Project() {
    }

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.briefs = new ArrayList<Brief>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Brief> getBriefs() {
        return briefs;
    }

    public void setBriefs(List<Brief> briefs) {
        this.briefs = briefs;
    }
}
