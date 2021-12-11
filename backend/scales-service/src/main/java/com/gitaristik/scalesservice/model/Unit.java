package com.gitaristik.scalesservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="`unit`")
public class Unit {

    @Id
    private Long id;
    private String unitName;
    private int unitOrder;

    @ManyToOne
    @JoinColumn(name="section_id")
    @JsonIgnore
    private Section section;

    @JsonIgnoreProperties("unit")
    @OneToOne(mappedBy = "unit", cascade = CascadeType.ALL)
    private Post introduction;

    @JsonIgnoreProperties("unit")
    @OneToMany(mappedBy = "unit", cascade = CascadeType.ALL)
    private List<Lesson> lessonList;

    public Unit() {
    }

    public Unit(String unitName, int unitOrder) {
        this.unitName = unitName;
        this.unitOrder = unitOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getUnitOrder() {
        return unitOrder;
    }

    public void setUnitOrder(int unitOrder) {
        this.unitOrder = unitOrder;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Post getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Post introduction) {
        this.introduction = introduction;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }
}
