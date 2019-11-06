package com.springjpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "technology")
public class Technology implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "technology")
    private String technology;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "technologycategory",
            joinColumns = { @JoinColumn(name = "technologyid", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "categoryid", referencedColumnName = "id") })
    private List<CategoryTechnology> categorytechnology;
    
    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CategoryTechnology> getCategorytechnology() {
        return categorytechnology;
    }

    public void setCategorytechnology(List<CategoryTechnology> categorytechnology) {
        this.categorytechnology = categorytechnology;
    }
}