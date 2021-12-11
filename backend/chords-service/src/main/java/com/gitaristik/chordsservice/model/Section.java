package com.gitaristik.chordsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="`section`")
public class Section {

    @Id
    private Long id;
    private String sectionName;
    private int sectionOrder;

    @ManyToOne
    @JoinColumn(name="subject_id")
    @JsonIgnore
    private Subject subject;

    @JsonIgnoreProperties("section")
    @OneToMany(mappedBy = "section")
    private List<Unit> unitList;

    public Section() {
    }

    public Section(String sectionName, int sectionOrder) {
        this.sectionName = sectionName;
        this.sectionOrder = sectionOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(int sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<Unit> unitList) {
        this.unitList = unitList;
    }
}