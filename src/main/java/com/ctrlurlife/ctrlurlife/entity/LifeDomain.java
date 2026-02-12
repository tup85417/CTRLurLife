package com.ctrlurlife.ctrlurlife.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "life_domains")
public class LifeDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domainId;

    private String name;
    private String color;

    // Getters and Setters
    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods from diagram - to be implemented later
    // public List<Task> getTasksInDomain() { ... }
}
