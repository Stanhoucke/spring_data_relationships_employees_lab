package com.codeclan.example.employeerelationships.models;

import java.util.ArrayList;

public class Project {

    private Long id;
    private String name;
    private int duration;
    private ArrayList<Employee> employees;

    public Project(String name, int duration, ArrayList<Employee> employees) {
        this.name = name;
        this.duration = duration;
        this.employees = new ArrayList<Employee>();
    }

    public Project(){};

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

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
