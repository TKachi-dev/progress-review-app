package com.example.progressreviewapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "progress_record")
public class ProgressRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate date;
    private String didWhat;
    private String nextAction;
    private String blockedPoint;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDidWhat() {
        return didWhat;
    }

    public void setDidWhat(String didWhat) {
        this.didWhat = didWhat;
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction;
    }

    public String getBlockedPoint() {
        return blockedPoint;
    }

    public void setBlockedPoint(String blockedPoint) {
        this.blockedPoint = blockedPoint;
    }
}
