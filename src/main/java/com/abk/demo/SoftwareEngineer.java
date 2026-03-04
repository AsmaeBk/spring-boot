package com.abk.demo;

import java.util.Objects;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SoftwareEngineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String teckStack;
    
    // Default constructor
    public SoftwareEngineer() {
    }   

    // Constructor with parameters
    public SoftwareEngineer(Integer id, String name, String teckStack) {
        this.id = id;
        this.name = name;
        this.teckStack = teckStack;
    }


    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeckStack() {
        return teckStack;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setTeckStack(String teckStack) {
        this.teckStack = teckStack;
    }

    // Compare two SoftwareEngineer objects based on their id, name, and teckStack
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        SoftwareEngineer that = (SoftwareEngineer) obj;
        
        return (id != null ? id.equals(that.id) : that.id == null) &&
            (name != null ? name.equals(that.name) : that.name == null) &&
            (teckStack != null ? teckStack.equals(that.teckStack) : that.teckStack == null);
    }

     @Override
    public int hashCode() {
        return Objects.hash(id, name, teckStack);
    }

}