package com.gitaristik.chordsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gitaristik.chordsservice.enums.ModuleName;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="`subject`")
public class Subject {

    @Id
    private Long id;
    private String subjectName;
    private int subjectOrder;
    @Enumerated(EnumType.STRING)
    private ModuleName moduleName;

    @JsonIgnoreProperties("subject")
    @OneToMany(mappedBy = "subject")
    private List<Section> sectionList;

    public Subject() {
    }

    public Subject(Long id, String subjectName, int subjectOrder, ModuleName moduleName) {
        this.id = id;
        this.subjectName = subjectName;
        this.subjectOrder = subjectOrder;
        this.moduleName = moduleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectOrder() {
        return subjectOrder;
    }

    public void setSubjectOrder(int subjectOrder) {
        this.subjectOrder = subjectOrder;
    }

    public ModuleName getModuleName() {
        return moduleName;
    }

    public void setModuleName(ModuleName moduleName) {
        this.moduleName = moduleName;
    }

    public List<Section> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }
}
