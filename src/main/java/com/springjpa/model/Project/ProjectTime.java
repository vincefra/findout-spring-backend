package com.springjpa.model.Project;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projecttime")
public class ProjectTime implements Serializable {
    
    private static final long serialVersionUID = 9L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "projectid")
    private int projectid;

    @Column(name = "startdate")
    private String startdate;
    
    @Column(name = "enddate")
    private String enddate;

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getStartDates() {
        return startdate;
    }

    public void setStartDates(String startDates) {
        this.startdate = startDates;
    }

    public String getEndDates() {
        return enddate;
    }

    public void setEndDates(String endDates) {
        this.enddate = endDates;
    } 
}
